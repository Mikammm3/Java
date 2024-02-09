package com.mika.mybatis.mapper;

import com.mika.mybatis.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoXmlMapper {
    List<UserInfo> queryUserList();

    List<UserInfo> queryUserList2();

    Integer insert(UserInfo userInfo);

    Integer insert2(UserInfo userInfo);

    Integer delete(Integer id);

    Integer update(String password, Integer id);

    List<UserInfo> queryUserByWhere(String userName, Integer age);

    Integer update2(UserInfo userInfo);

    Integer batchDelete(List<Integer> ids);
}
