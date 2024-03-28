package com.mika.chatroomreview.model;

import lombok.Data;

import java.util.Date;

@Data
public class AddFriend {
    private Integer id;
    private Integer fromId;
    private Integer targetId;
    private String addReason;
    private Date createTime;
}
