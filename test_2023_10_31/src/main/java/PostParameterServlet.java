import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;


@WebServlet("/postParameter")
public class PostParameterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 约定，前端构造形如这样的请求:
        // POST /postParameter
        // Content-Type: x-www-form-urlencoded
        //
        // username=zhangsan&password=123

        // 就需要在后端代码中，把 body 中的 值 给拿到。
        // 获取值的方法，仍然是 getParameter 。
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("username=" + username);
        System.out.println("password=" + password);
        resp.getWriter().write("ok");
    }
}
