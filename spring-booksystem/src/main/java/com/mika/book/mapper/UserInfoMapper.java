package com.mika.book.mapper;

import com.mika.book.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserInfoMapper {
    @Select("select * from user_info where user_name = #{userName} and delete_flag != 1")
    UserInfo queryByName(String userName);
}
