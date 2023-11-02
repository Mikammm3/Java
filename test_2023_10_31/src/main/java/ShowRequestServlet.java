import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;


@WebServlet("/show")
public class ShowRequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 调用上述 api，把得到的结果构成成一个字符串，统一返回给客户端
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(req.getProtocol());
        stringBuilder.append("<br>");// 表示换行
        stringBuilder.append(req.getMethod());
        stringBuilder.append("<br>");
        stringBuilder.append(req.getRequestURI());
        stringBuilder.append("<br>");
        stringBuilder.append(req.getContextPath());
        stringBuilder.append("<br>");
        stringBuilder.append(req.getQueryString());
        stringBuilder.append("<br>");

        // 获取所有的 header
        Enumeration<String> names = req.getHeaderNames();
        while (names.hasMoreElements()) {
            String key = names.nextElement();
            String val = req.getHeader(key);
            stringBuilder.append(key + ": " + val + "<br>");
        }
        // 告诉浏览器，我们的数据是什么类型，任何一次服务器返回，都应该做的事情
        resp.setContentType("text/html; charset=utf8");
        // 把上述内容整体返回到客户端这边
        resp.getWriter().write(stringBuilder.toString());
    }
}
