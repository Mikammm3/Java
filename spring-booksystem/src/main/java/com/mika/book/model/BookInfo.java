package com.mika.book.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BookInfo {
    private Integer id;
    private String bookName;
    private String author;
    private Integer count;
    private BigDecimal price;
    private String publish;
    private Integer state;// 1-可借阅 2-不可借阅
    private String stateCN;
}
