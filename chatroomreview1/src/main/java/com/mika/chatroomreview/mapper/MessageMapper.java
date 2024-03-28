package com.mika.chatroomreview.mapper;

import com.mika.chatroomreview.model.Message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MessageMapper {
    // 根据 sessionId，获取历史消息
    @Select("select m.*, u.user_name as fromName from message m, user u" +
            " where m.session_id = #{sessionId} and u.user_id = m.from_id order by m.post_time desc limit 100")
    List<Message> getHistoryBySessionId(Integer sessionId);

    @Insert("insert into message(from_id,session_id,content) values(#{fromId},#{sessionId},#{content})")
    Integer addMessage(Message message);
}
