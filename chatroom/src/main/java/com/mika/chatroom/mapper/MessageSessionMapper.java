package com.mika.chatroom.mapper;

import com.mika.chatroom.model.Friend;
import com.mika.chatroom.model.MessageSession;
import com.mika.chatroom.model.MessageSessionUserItem;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MessageSessionMapper {

    // 1. 根据 userId，获取一组对应的 sessionId
    @Select("select msu.session_id from message_session_user msu, message_session ms" +
            " where msu.user_id = #{userId} and ms.session_id = msu.session_id order by ms.last_time desc")
    List<Integer> getSessionIdByUserId(Integer userId);


    // 2. 根据 sessionId 查询会话包含哪些用户 (不包括自己)
    List<Friend> getFriendBySessionId(Integer sessionId, Integer userId);

    // 3. 新增一个会话记录，同时返回 sessionId
    @Options(useGeneratedKeys = true, keyProperty = "sessionId")
    @Insert("insert into message_session values(null,now())")
    Integer addMessageSession(MessageSession messageSession);

    // 4. 给 message_session_user 表也新增对应的记录
    @Insert("insert into message_session_user(session_id, user_id) values(#{sessionId},#{userId})")
    Integer addMessageSessionUser(MessageSessionUserItem messageSessionUserItem);
}
