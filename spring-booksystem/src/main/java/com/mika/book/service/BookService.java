package com.mika.book.service;

import com.mika.book.dao.BookDao;
import com.mika.book.model.BookInfo;

import java.util.List;

public class BookService {
    // 根据数据层返回的结果，对数据进行处理
    public List<BookInfo> getBookInfoList() {
        List<BookInfo> bookInfoList;
        BookDao bookDao = new BookDao();
        // 1. 从dao获取数据
        bookInfoList = bookDao.mockBookData();
        // 2. 对数据进行处理: 状态转换
        for (BookInfo bookInfo : bookInfoList) {
            if (bookInfo.getState() == 1) {
                bookInfo.setStateCN("可借阅");
            } else if (bookInfo.getState() == 2) {
                bookInfo.setStateCN("不可借阅");
            }
        }
        return bookInfoList;
    }
}
