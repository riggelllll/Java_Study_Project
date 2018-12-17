

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Hello_Java {



    public static void main(String[] args) throws Exception{
        Connection connect = null;
        Statement statement = null;
        ResultSet resultSet = null;

        Class.forName("com.mysql.cj.jdbc.Driver");
        String serverName = "localhost";
        String mydatabase = "test";
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

        String username = "phpmyadmin";
        String password = "28121994";

        connect = DriverManager.getConnection(url, username, password);
        statement = connect.createStatement();
        resultSet = statement
                .executeQuery("select * from user");
        while (resultSet.next()){
            System.out.println(resultSet.getString("id"));
            System.out.println(resultSet.getString("first_name"));
            System.out.println(resultSet.getString("second_name"));
            System.out.println(resultSet.getString("sex"));
        }


    }

}
