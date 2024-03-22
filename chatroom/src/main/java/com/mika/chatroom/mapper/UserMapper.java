package com.mika.chatroom.mapper;

import com.mika.chatroom.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    @Insert("insert into user(user_name,password) values (#{userName},#{password})")
    Integer insert(User user);

    @Select("select * from user where user_name = #{userName}")
    User selectByName(String userName);
}
