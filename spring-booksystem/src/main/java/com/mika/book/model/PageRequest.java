package com.mika.book.model;

import lombok.Data;

@Data
public class PageRequest {
    // 当前页
    private Integer currentPage = 1;
    // 每页显示个数
    private Integer pageSize = 10;

    /**
     * 从多少条记录开始查询
     */
    private Integer offset;

    public Integer getOffset() {
        return (currentPage - 1) * pageSize;
    }
}
