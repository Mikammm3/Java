package com.mika.chatroom.service;

import com.mika.chatroom.mapper.FriendMapper;
import com.mika.chatroom.model.AddFriend;
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

    public Integer addFriendRequired(String addReason, Integer fromId, Integer targetId) {
        return friendMapper.addFriendRequired(addReason, fromId, targetId);
    }

    public AddFriend FindSameAddFriendRequired(Integer fromId, Integer targetId) {
        return friendMapper.FindSameAddFriendRequired(fromId, targetId);
    }

    public List<AddFriend> getAddFriendRequireById(Integer targetId) {
        return friendMapper.getAddFriendRequireById(targetId);
    }

    public Integer addFriend(Integer userId, Integer friendId) {
        return friendMapper.addFriend(userId, friendId);
    }

    public Integer deleteAddFriendRequire(Integer fromId, Integer targetId) {
        return friendMapper.deleteAddFriendRequire(fromId, targetId);
    }

    public Friend isFriendShip(Integer userId, Integer friendId) {
        return friendMapper.isFriendShip(userId, friendId);
    }
}
