package com.mika.chatroom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Friend {
    private Integer friendId;
    private String friendName;
}
