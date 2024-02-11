package com.mika.book.mapper;

import com.mika.book.model.BookInfo;
import com.mika.book.model.PageRequest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface BookInfoMapper {

    @Insert("insert into book_info(book_name,author,count,price,publish) " +
            " values(#{bookName},#{author},#{count},#{price},#{publish})")
    Integer insertBook(BookInfo bookInfo);

    /**
     * 查询总数
     */
    @Select("select count(1) from book_info where `status` <> 0")
    Integer count();


    /**
     * 查询当前页数据
     */
    @Select("select * from book_info where `status` <> 0 order by id desc limit #{offset},#{pageSize}")
    List<BookInfo> queryListByPage(PageRequest pageRequest);

    /**
     * 根据 id 查询图书信息
     */
    @Select("select * from book_info where id = #{id} and `status` <> 0")
    BookInfo queryBookById(Integer id);

    /**
     * 根据 id 修改图书信息
     */
    Integer updateBook(BookInfo bookInfo);

}
