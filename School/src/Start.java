import com.mysql.cj.jdbc.JdbcConnection;

import java.sql.*;

public class Start {
    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/test";
        String username = "hanna";
        String password = "P@ssw0rd";
        Connection connection = null;
        Statement statement;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dbUrl + "?user=" + username + "&password=" + password);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from students");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(2));
                System.out.println(resultSet.getString(1));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

}
