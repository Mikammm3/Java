package com.example.demo.mapper;


import com.example.demo.model.MessageInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MessageMapper {

    /**
     * 插入留言信息
     *
     * @param messageInfo
     * @return
     */
    @Insert("insert into message_info(`from`,`to`,message) values(#{from}, #{to}, #{message})")
    Integer insertMessage(MessageInfo messageInfo);


    /**
     * 查询留言信息
     *
     * @return
     */
    @Select("select * from message_info where delete_flag != 1")
    List<MessageInfo> queryMessageList();
}
