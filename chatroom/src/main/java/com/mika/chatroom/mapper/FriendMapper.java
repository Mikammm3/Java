package com.mika.chatroom.mapper;

import com.mika.chatroom.model.Friend;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FriendMapper {

    @Select("select f.friend_id as friendId, u.user_name as friendName from friend f, user u where f.user_id = #{userId} and u.user_id = f.friend_id")
    List<Friend> selectFriendList(Integer userId);
}
