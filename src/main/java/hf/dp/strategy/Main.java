package hf.dp.strategy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        insert();
    }

    public static void insert() throws ClassNotFoundException, SQLException {
        Class.forName("org.h2.Driver");

        Connection conn = DriverManager.getConnection("db url 입력", "ID", "pw");

        Statement st = conn.createStatement();

        st.executeUpdate("INSERT INTO `USER` VALUES (3, 'java', '1111')");

        st.close();
        conn.close();
    }
}
