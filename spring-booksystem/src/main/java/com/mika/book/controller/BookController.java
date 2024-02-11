package com.mika.book.controller;


import com.mika.book.model.BookInfo;
import com.mika.book.model.PageRequest;
import com.mika.book.model.PageResult;
import com.mika.book.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;


    @RequestMapping("/addBook")
    public String addBook(BookInfo bookInfo) {
        log.info("添加图书，bookInfo:{}:", bookInfo);
        // 参数校验
        if (!StringUtils.hasLength(bookInfo.getBookName())
                || !StringUtils.hasLength(bookInfo.getAuthor())
                || !StringUtils.hasLength(bookInfo.getPublish())
                || bookInfo.getCount() == null
                || bookInfo.getPrice() == null
                || bookInfo.getPrice().intValue() < 0) {
            return "参数为空";
        }
        // 添加图书
        try {
            bookService.insertBook(bookInfo);
        } catch (Exception e) {
            log.error("添加图书失败，e:{}", e);
            return "内部发生错误，请联系管理员";
        }
        return "";
    }

    @RequestMapping("/getListByPage")
    public PageResult<BookInfo> getListByPage(PageRequest pageRequest) {
        log.info("查询列表信息，pageRequest:{}", pageRequest);

        if (pageRequest.getCurrentPage() < 1) return null;
        return bookService.getListByPage(pageRequest);
    }

    @RequestMapping("/queryBookById")
    public BookInfo queryBookById(Integer bookId) {
        log.info("查询图书信息，bookId: " + bookId);
        if (bookId <= 0) {
            log.error("非法图书 ID, bookId" + bookId);
            return null;
        }
        return bookService.queryBookById(bookId);
    }

    @RequestMapping("/updateBook")
    public boolean updateBook(BookInfo bookInfo) {
        log.info("更新图书，updateBook:{}", bookInfo);
        // 参数校验
        if (!StringUtils.hasLength(bookInfo.getBookName())
                || !StringUtils.hasLength(bookInfo.getAuthor())
                || !StringUtils.hasLength(bookInfo.getPublish())
                || bookInfo.getCount() == null
                || bookInfo.getPrice() == null
                || bookInfo.getPrice().intValue() < 0) {
            return false;
        }
        try {
            Integer result = bookService.updateBook(bookInfo);
            if (result <= 0) return false;
        } catch (Exception e) {
            log.error("更新图书失败，e:{}", e);
            return false;
        }
        return true;
    }
}
