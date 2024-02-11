package com.mika.book.service;

import com.mika.book.enums.BookStatusEnums;
import com.mika.book.mapper.BookInfoMapper;
import com.mika.book.model.BookInfo;
import com.mika.book.model.PageRequest;
import com.mika.book.model.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    // 根据数据层返回的结果，对数据进行处理
    @Autowired
    private BookInfoMapper bookInfoMapper;

    public Integer insertBook(BookInfo bookInfo) {
        return bookInfoMapper.insertBook(bookInfo);
    }

    public PageResult<BookInfo> getListByPage(PageRequest pageRequest) {
        // 1. 查询记录的总数
        Integer count = bookInfoMapper.count();
        // 2. 查询当前页的数据
        List<BookInfo> bookInfos = bookInfoMapper.queryListByPage(pageRequest);
        for (BookInfo bookInfo : bookInfos) {
            // 根据状态，设置描述
            bookInfo.setStateCN(BookStatusEnums.getDescByCode(bookInfo.getStatus()).getDesc());
        }

        return new PageResult<>(bookInfos, count, pageRequest);

    }

    public BookInfo queryBookById(Integer bookId) {
        return bookInfoMapper.queryBookById(bookId);
    }

    public Integer updateBook(BookInfo bookInfo) {
        return bookInfoMapper.updateBook(bookInfo);
    }
}
