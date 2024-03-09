package com.mika.blog.model;

import com.mika.blog.utils.DateUtils;
import lombok.Data;

import java.util.Date;

@Data

public class BlogInfo {
    private Integer id;
    private String title;
    private String content;
    private Integer userId;
    private Integer deleteFlag;
    private Date createTime;
    private Date updateTime;
    private Boolean isLoginUser = false;

    public BlogInfo() {
    }

    public BlogInfo(Integer id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public BlogInfo(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public BlogInfo(String title, String content, Integer userId) {
        this.title = title;
        this.content = content;
        this.userId = userId;
    }

    public String getCreateTime() {
        return DateUtils.formatDate(this.createTime);
    }
}
