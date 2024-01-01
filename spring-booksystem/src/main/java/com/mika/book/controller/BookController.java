package com.mika.book.controller;


import com.mika.book.model.BookInfo;
import com.mika.book.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/book")
public class BookController {

    @RequestMapping("/getList")
    public List<BookInfo> getList() {
        // 1. 从数据库中获取数据
        BookService bookService = new BookService();
        List<BookInfo> bookInfoList = bookService.getBookInfoList();
        // 2. 对数据进行处理: 状态转换
        // 3. 返回数据
        return bookInfoList;
    }

}
