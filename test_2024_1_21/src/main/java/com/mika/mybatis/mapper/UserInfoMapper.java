package com.mika.mybatis.mapper;


import com.mika.mybatis.model.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 访问数据库
 */
@Mapper
public interface UserInfoMapper {

    /**
     * 返回数据列表
     *
     * @return
     */
    @Select("select id,username," +
            "password,age,gender,phone," +
            "delete_flag as deleteFlag," +
            "create_time as createTime, " +
            "update_time as updateTime from userinfo")
    List<UserInfo> queryUserList();

    @Results(id = "Base", value = {
            @Result(column = "delete_flag", property = "deleteFlag"),
            @Result(column = "create_time", property = "createTime"),
            @Result(column = "update_time", property = "updateTime")
    })
    @Select("SELECT * FROM userinfo WHERE id = #{userId}")
    UserInfo queryUserInfo(Integer userId);

    @Select("SELECT * FROM userinfo WHERE id = ${userId}")
    UserInfo queryUserInfo2(Integer userId);

    @Select("SELECT * FROM userinfo WHERE username = #{name}")
    UserInfo queryUserInfoByName(String name);

    @Select("SELECT * FROM userinfo WHERE username = '${name}'")
    UserInfo queryUserInfoByName2(String name);


    @ResultMap(value = "Base")
    @Select("SELECT * FROM userinfo WHERE id = #{userId} AND delete_flag = #{deleteFlag}")
    UserInfo queryUserInfoByDF(Integer userId, Integer deleteFlag);

    @Select("SELECT * FROM userinfo WHERE id = #{id} AND delete_flag = #{deleteFlag}")
    UserInfo queryUserInfoParam(@Param("id") Integer userId, Integer deleteFlag);

    @Insert("insert into userinfo" +
            "(username, password, age, gender,phone) " +
            "values(#{username},#{password},#{age},#{gender},#{phone})")
    Integer insert(UserInfo userInfo);


    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into userinfo" +
            "(username, password, age, gender,phone) " +
            "values(#{userInfo.username},#{userInfo.password}," +
            "#{userInfo.age},#{userInfo.gender},#{userInfo.phone})")
    Integer insert2(@Param("userInfo") UserInfo userInfo);


    @Delete("delete from userinfo where id = #{id}")
    Integer delete(Integer id);


    @Update("update userinfo set password = #{password} where id = #{id}")
    Integer update(String password, Integer id);


    @Update("update userinfo set username = #{username},password = #{password} where id = #{id}")
    Integer updateByOb(UserInfo userInfo);

    @Select("SELECT * FROM userinfo WHERE username = '${userName}' and password = '${password}'")
    List<UserInfo> queryUserByNameAndPs(String userName, String password);


    @Select("select * from userinfo order by id ${order}")
    List<UserInfo> queryUserByOrder(String order);


    @Select("select * from userinfo where username like '%${name}%' ")
    List<UserInfo> queryUserByLike(String name);

    @Select("SELECT * FROM userinfo where username LIKE CONCAT('%',#{name},'%')")
    List<UserInfo> queryUserByLike2(String name);
}
