package com.mika.book.controller;


import com.mika.book.constants.Constants;
import com.mika.book.model.*;
import com.mika.book.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;


@Slf4j
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;


    @RequestMapping(value = "/addBook", produces = "application/json")
    public Result addBook(BookInfo bookInfo) {
        log.info("添加图书，bookInfo:{}:", bookInfo);
        // 参数校验
        if (!StringUtils.hasLength(bookInfo.getBookName())
                || !StringUtils.hasLength(bookInfo.getAuthor())
                || !StringUtils.hasLength(bookInfo.getPublish())
                || bookInfo.getCount() == null
                || bookInfo.getPrice() == null
                || bookInfo.getPrice().intValue() < 0) {
            return Result.fail("参数为空");
        }
        // 添加图书
        try {
            bookService.insertBook(bookInfo);
        } catch (Exception e) {
            log.error("添加图书失败，e:{}", e);
            return Result.fail("内部发生错误，请联系管理员");
        }
        return Result.success("");
    }

    @RequestMapping("/getListByPage")
    public Result<PageResult<BookInfo>> getListByPage(PageRequest pageRequest, HttpSession session) {
        log.info("查询列表信息，pageRequest:{}", pageRequest);
//        // 验证用户是否登录
//        UserInfo userInfo = (UserInfo) session.getAttribute(Constants.USER_SESSION_KEY);
//        if (userInfo == null || userInfo.getId() < 1) return Result.unlogin();
        if (pageRequest.getCurrentPage() < 1) {
            return Result.fail("非法参数");
        }
        return Result.success(bookService.getListByPage(pageRequest));
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

    /**
     * 更新图书/删除图书
     *
     * @param bookInfo
     * @return
     */
    @RequestMapping("/updateBook")
    public Result updateBook(BookInfo bookInfo) {
        log.info("更新图书，updateBook:{}", bookInfo);
        // 参数校验
        if (bookInfo.getId() <= 0) {
            return Result.fail(false, "非法 ID");
        }
        try {
            Integer result = bookService.updateBook(bookInfo);
            if (result <= 0) return Result.fail(false, "更新失败");
        } catch (Exception e) {
            log.error("更新图书失败，e:{}", e);
            return Result.fail(false, e.getMessage());
        }
        return Result.success(true);
    }

    /**
     * 批量删除
     */
    @RequestMapping("/batchDelete")
    public boolean batchDelete(@RequestParam(value = "ids", required = false) List<Integer> ids) {
        log.info("批量删除数据，ids:{}", ids);
        if (ids == null || ids.size() == 0) return false;
        try {
            Integer result = bookService.batchDelete(ids);
            if (result <= 0) return false;
            return true;
        } catch (Exception e) {
            log.error("批量删除失败，ids:{},e:{}", ids, e);
            return false;
        }

    }
}
