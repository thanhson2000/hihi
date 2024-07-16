package practices.day7_05;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC connect DB
 *
 * @author thanhson2000 phansonbs2000@gmail.com
 * @version 14/07/2024 17:21
 * @since JDK11
 */
public class JDBCConnection {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itheima", "root", "27112222");
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO citizen() values (null,'007','Huong',27,'Bac Giang')");
            System.out.println(" SQL insert into successful");
            System.out.println("hahaha");
            // 修复 catch 的bug
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } 
    }
}
