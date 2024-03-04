package com.mika.blog.mapper;

import com.mika.blog.model.BlogInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BlogMapper {
    // 查询博客列表
    @Select("select * from blog where delete_flag = 0 order by create_time desc")
    List<BlogInfo> getBlogList();

    // 根据博客ID，查询博客信息
    @Select("select * from blog where delete_flag = 0 and id = #{blogId}")
    BlogInfo getBlogById(Integer blogId);

    // 根据博客ID，修改博客信息
    // 此修改包含修改和删除，根据参数修改什么
    Integer updateBlog(BlogInfo blogInfo);

    // 插入博客
    @Insert("insert into blog(title, content, user_id) values(#{title}, #{content}, #{userId})")
    Integer insertBlog(BlogInfo blogInfo);
}
