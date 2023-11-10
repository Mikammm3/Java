package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Blog;
import model.BlogDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/blog")
public class BlogServlet extends HttpServlet {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 查询数据库，得到博客列表，
        BlogDao blogDao = new BlogDao();
        List<Blog> blogList = blogDao.getBlogs();
        // 把博客列表按照 json 格式返回回去
        String respJson = objectMapper.writeValueAsString(blogList);
        System.out.println("respJson: " + respJson);
        resp.setContentType("application/json; charset=utf8");
        resp.getWriter().write(respJson);
    }
}
