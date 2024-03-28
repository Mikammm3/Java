package com.mika.chatroomreview.mapper;

import com.mika.chatroomreview.model.Friend;
import com.mika.chatroomreview.model.MessageSession;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MessageSessionMapper {

    // 根据 userId，查找用户会话列表
    @Select("select msu.session_id from message_session_user msu, message_session ms" +
            " where msu.user_id = #{userId} and ms.session_id = msu.session_id order by ms.last_time desc")
    List<Integer> getSessionByUserId(Integer userId);

    // 根据 sessionId，查找朋友列表
    @Select("select" +
            " msu.user_id as friendId," +
            " u.user_name as friendName" +
            " from message_session_user msu, user u" +
            " where msu.session_id = #{sessionId}" +
            " and msu.user_id != #{userId}" +
            " and u.user_id = msu.user_id")
    List<Friend> getFriendsBySessionId(Integer sessionId, Integer userId);

    // 根据 sessionId，查找最后一条消息
    @Select("select content from message where session_id = #{sessionId} order by post_time desc limit 1")
    String getLastMessageBySessionId(Integer sessionId);

    @Options(useGeneratedKeys = true, keyProperty = "sessionId")
    @Insert("insert into message_session values(null, now())")
    Integer addMessageSession(MessageSession messageSession);

    @Insert("insert into message_session_user(session_id, user_id) values(#{sessionId}, #{userId})")
    Integer addMessageSessionUser(Integer sessionId, Integer userId);
}
