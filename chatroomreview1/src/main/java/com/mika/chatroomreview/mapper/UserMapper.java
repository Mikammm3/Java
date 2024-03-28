package com.mika.chatroomreview.mapper;

import com.mika.chatroomreview.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    // 根据 userName，查询数据库信息
    @Select("select * from user where user_name = #{userName}")
    User selectUserByName(String userName);

    // 新增 user 用户
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    @Insert("insert into user values(null,#{userName},#{password})")
    Integer insertUser(User user);

    @Select("select * from user where user_name like concat('%',#{userName},'%')")
    List<User> getUsersByName(String userName);
}
