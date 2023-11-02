import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getParameter")
public class GetParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 此处约定，请求中给定的 query string 是形如: username=zhangsan&password=123
        // 上述 query string，就会被 tomcat 自动解析成一个 Map 这样的结构
        // getParameter 就是在查询 Map<String,String> 里的内容
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        // 就可以拿到这俩内容之后，做一些其他的任意处理
        System.out.println("username=" + username);
        System.out.println("password=" + password);
        
        resp.getWriter().write("ok");
    }
}
