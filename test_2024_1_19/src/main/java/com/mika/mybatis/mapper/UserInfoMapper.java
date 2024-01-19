package com.mika.mybatis.mapper;


import com.mika.mybatis.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *  访问数据库
 */
@Mapper
public interface UserInfoMapper {

    /**
     * 返回数据列表
     * @return
     */
    @Select("SELECT * FROM userinfo")
    List<UserInfo> queryUserList();

    @Select("SELECT * FROM userinfo WHERE id = #{userId}")
    UserInfo queryUserInfo(Integer userId);

    @Select("SELECT * FROM userinfo WHERE id = #{userId} AND delete_flag = #{deleteFlag}")
    UserInfo queryUserInfoByDF(Integer userId, Integer deleteFlag);

    @Select("SELECT * FROM userinfo WHERE id = #{id} AND delete_flag = #{deleteFlag}")
    UserInfo queryUserInfoParam(@Param("id") Integer userId, Integer deleteFlag);
}
