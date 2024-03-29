package com.mika.chatroomreview.service;

import com.mika.chatroomreview.mapper.FriendMapper;
import com.mika.chatroomreview.model.AddFriend;
import com.mika.chatroomreview.model.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService {
    @Autowired
    private FriendMapper friendMapper;

    public List<Friend> getFriendsByUserId(Integer userId) {
        return friendMapper.getFriendsByUserId(userId);
    }

    public Friend isFriendShip(Integer userId, Integer friendId) {
        return friendMapper.isFriendShip(userId, friendId);
    }

    public AddFriend FindSameAddFriendRequired(Integer fromId, Integer targetId) {
        return friendMapper.FindSameAddFriendRequired(fromId, targetId);
    }

    public Integer addFriendRequired(String addReason, Integer fromId, Integer targetId) {
        return friendMapper.addFriendRequired(addReason, fromId, targetId);
    }

    public List<AddFriend> getAddRequire(Integer targetId) {
        return friendMapper.getAddRequire(targetId);
    }

    public Integer insertFriend(Integer userId, Integer friendId) {
        return friendMapper.insertFriend(userId, friendId);
    }

    public Integer deleteAddFriendRequire(Integer fromId, Integer targetId) {
        return friendMapper.deleteAddFriendRequire(fromId, targetId);
    }
}
