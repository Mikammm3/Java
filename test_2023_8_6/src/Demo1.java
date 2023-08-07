import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

// 通过这个代码，往数据库的表中，插入一条记录
public class Demo1 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：>");
        String name = scanner.nextLine();
        System.out.println("请输入学号:>");
        int id = scanner.nextInt();
        // 1.先创建 DataSource
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/java109?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("1234");

        // 2.建立和数据库服务器之间的连接，连接好了之后，才能进行 请求-响应 交互
        Connection connection = dataSource.getConnection();

        // 3.构造 sql (代码中的 sql 不需要写 ; )
        //String sql = "insert into student values(" + id + ", '" + name + "')";
        //String sql = "delete from student where id = 1";
        //String sql = "update student set name = '李四' where id = 1";
        String sql = "insert into student values(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.setString(2, name);

        // 4.把 sql 发送给服务器,返回值是一个整数，表示影响到的行数
        int n = statement.executeUpdate(sql);
        System.out.println("n = " + n);

        // 5.释放资源，关闭连接,释放顺序，后获取到的资源，先释放
        statement.close();
        connection.close();
    }
}
