package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Blog;
import model.BlogDao;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


@WebServlet("/blog")
public class BlogServlet extends HttpServlet {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String blogId = req.getParameter("blogId");
        BlogDao blogDao = new BlogDao();
        String respJson = "";
        if (blogId == null) {
            // 请求中没有 query string，请求来自博客列表页
            // 查询数据库，得到博客列表，
            List<Blog> blogList = blogDao.getBlogs();
            // 把博客列表按照 json 格式返回回去
            respJson = objectMapper.writeValueAsString(blogList);
        } else {
            // 请求中有 query string，请求来自博客详情页
            Blog blog = blogDao.getBlog(Integer.parseInt(blogId));
            respJson = objectMapper.writeValueAsString(blog);

        }
        System.out.println("respJson: " + respJson);
        resp.setContentType("application/json; charset=utf8");
        resp.getWriter().write(respJson);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 读取请求中的参数
        req.setCharacterEncoding("utf8");
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        if (title == null || title.length() == 0 || content == null || content.length() == 0) {
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("当前标题或者正文为空！");
            return;
        }
        // 2. 从会话中，拿到当前登录用户的 userId
        HttpSession session = req.getSession(false);
        if (session == null) {
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("您当前尚未登录！");
            return;
        }
        User user = (User) session.getAttribute("user");
        if (user == null) {
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("您当前尚未登录！");
            return;
        }
        // 3. 构造 blog 对象
        Blog blog = new Blog();
        blog.setTitle(title);
        blog.setContent(content);
        // 从会话中拿到 当前正在登录的用户的 userId，设置进去即可
        blog.setUserId(user.getUserId());
        // 4. 插入到数据库中
        BlogDao blogDao = new BlogDao();
        blogDao.insert(blog);
        // 5. 返回一个 302 这样的重定向报文，跳转到博客列表页
        resp.sendRedirect("blog_list.html");
    }
}
