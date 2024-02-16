package com.mika.book.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PageResult<T> {
    private List<T> records;
    private Integer count;
    private PageRequest pageRequest;
}
