package com.hongjia;

import com.hongjia.pojo.User;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class JdbcTest {
    /**
     * JDBC入门程序
     */
    @Test
    public void testUpdate() throws Exception {
        // 1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2.获取数据库连接
        String url = "jdbc:mysql://localhost:3306/web01";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        // 3.获取SQL语句执行对象
        Statement statement = connection.createStatement();

        // 4.执行SQL语句
        long l = statement.executeLargeUpdate("update user set age = 25 where id = 1");// DML
        System.out.println("SQL语句执行完毕影响的记录数为：" + l);

        // 5.释放资源
        statement.close();
        connection.close();
    }

    @Test
    public void testSelect() {
        String url = "jdbc:mysql://localhost:3306/web01";
        String username = "root";
        String password = "root";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null; // 封装查询返回的结果的

        try {
            // 1.注册 JDBC 驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2.打开连接
            conn = DriverManager.getConnection(url, username, password);

            // 3.执行查询
            String sql = "select id, username, password, name, age from user where username = ? and password = ?"; // 预编译SQL
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, "daqiao");
            stmt.setString(2, "123456");

            rs = stmt.executeQuery();

            // 4.处理结果集
            while (rs.next()) {
                User user = new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("name"),
                        rs.getInt("age")
                );
                System.out.println(user); // 使用lombok 的 @Data 自动生成的 toString 方法
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 5.释放资源
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
