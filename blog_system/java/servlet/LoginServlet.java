package servlet;

import model.User;
import model.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 读取参数中的用户名和密码
        req.setCharacterEncoding("utf8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //    验证一下参数，看看是否合理
        if (username == null || username.length() == 0 || password == null || password.length() == 0) {
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("当前用户名或者密码为空!");
            return;
        }
        // 2. 查询数据库，看看用户名和密码是否正确
        UserDao userDao = new UserDao();
        User user = userDao.getUserByName(username);
        if (user == null) {
            // 用户名不存在
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("您输入的用户名或者密码错误!");
            return;
        }
        if (!password.equals(user.getPassword())) {
            // 密码不正确
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("您输入的用户名或者密码错误!");
            return;
        }
        // 3. 创建会话
        HttpSession session = req.getSession(true);
        session.setAttribute("user", user);
        // 4. 跳转到主页
        resp.sendRedirect("blog_list.html");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 通过这个方法，来反馈用户的登录状态
        // 一个简单的判定方式，就是看会话是否存在
        // 此处使用一个更严格的方式，不仅要求会话要存在，还要求会话中要能保存 user 对象
        // (之所以给出这种设定，也是为了后面实现 退出登录 做个铺垫)
        HttpSession session = req.getSession(false);
        if (session == null) {
            // 会话不存在，用户属于未登录状态
            resp.setStatus(403);
            return;
        }
        User user = (User) session.getAttribute("user");
        if (user == null) {
            // user 对象也不存在，同样也属于未登录状态
            resp.setStatus(403);
            return;
        }
        // 两个都存在，返回 200
        // 此处 200 不写也行，默认就是200
        resp.setStatus(200);

    }
}
