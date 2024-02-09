package com.mika.mybatis.mapper;

import com.mika.mybatis.model.ArticleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ArticleInfoMapper {
    @Select("SELECT ta.*,tb.username,tb.age,tb.phone,tb.gender FROM `articleinfo` ta " +
            "left join userinfo tb on ta.uid = tb.id " +
            "where ta.id = #{id}")
    ArticleInfo queryArticle(Integer id);
}
