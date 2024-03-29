package com.mika.chatroomreview.mapper;

import com.mika.chatroomreview.model.AddFriend;
import com.mika.chatroomreview.model.Friend;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FriendMapper {

    @Select("select f.friend_id, u.user_name as friendName from friend f, user u" +
            " where f.user_id = #{userId} and u.user_id = f.friend_id")
    List<Friend> getFriendsByUserId(Integer userId);

    @Select("select friend_id from friend where user_id = #{userId} and friend_id = #{friendId}")
    Friend isFriendShip(Integer userId, Integer friendId);

    @Select("select * from add_friend where from_id = #{fromId} and target_id = #{targetId}")
    AddFriend FindSameAddFriendRequired(Integer fromId, Integer targetId);

    @Insert("insert into add_friend(from_id,target_id,add_reason) values(#{fromId},#{targetId},#{addReason})")
    Integer addFriendRequired(String addReason, Integer fromId, Integer targetId);

    @Select("select af.*, u.user_name as fromName from add_friend af, user u where af.target_id = #{targetId} and u.user_id = af.from_id")
    List<AddFriend> getAddRequire(Integer targetId);

    @Insert("insert into friend values(#{userId}, #{friendId})")
    Integer insertFriend(Integer userId, Integer friendId);

    @Delete("delete from add_friend where from_id = #{fromId} and target_id = #{targetId}")
    Integer deleteAddFriendRequire(Integer fromId, Integer targetId);
}
