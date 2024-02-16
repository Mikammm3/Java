package com.mika.book.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class BookInfo {
    private Integer id;
    private String bookName;
    private String author;
    private Integer count;
    private BigDecimal price;
    private String publish;
    private Integer status;// 1-可借阅 2-不可借阅 0-已删除
    private String stateCN;
    private Date createTime;
    private Date updateTime;
}
