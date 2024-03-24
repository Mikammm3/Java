package com.mika.chatroom.mapper;

import com.mika.chatroom.model.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MessageMapper {

    // 根据 sessionId，获取会话中的最后一条消息
    @Select("select content from message where session_id = #{sessionId} order by post_time desc limit 1")
    String getLastMessageBySessionId(Integer sessionId);

    // 获取指定会话历史消息列表
    // 有的消息列表非常多，显示出来会非常卡
    // 所以可以做出限制，默认只取最近的 100 条消息
    @Select("select m.*, u.user_name as fromName " +
            " from message m, user u" +
            " where m.session_id = #{sessionId} and m.from_id = u.user_id order by m.post_time desc limit 100")
    List<Message> getMessageListBySessionId(Integer sessionId);
}
