package com.mika.chatroom.service;

import com.mika.chatroom.mapper.FriendMapper;
import com.mika.chatroom.model.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService {

    @Autowired
    private FriendMapper friendMapper;

    public List<Friend> selectFriendList(Integer userId) {
        return friendMapper.selectFriendList(userId);
    }
}
