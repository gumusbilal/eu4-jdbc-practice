package jdbctests;

import org.testng.annotations.Test;

import java.sql.*;

public class jdbc_example {

    String dbUrl = "jdbc:oracle:thin:@3.93.145.140:1521:xe";
    String dbUsername = "hr";
    String dbPassword = "hr";

    public jdbc_example() throws SQLException {
    }

    @Test
    public void test1()throws SQLException{

    //create connection
    Connection connection = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);

    //create statement object
    Statement statement=connection.createStatement();

    // run query and get the result in resultSet object
    ResultSet resultSet= statement.executeQuery("select * from departments");

    //close all connections
        resultSet.close();
        statement.close();
        connection.close();
}
}
