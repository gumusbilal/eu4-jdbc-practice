package jdbctests;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        String dbUrl = "jdbc:oracle:thin:@3.93.145.140:1521:xe";
        String dbUsername = "hr";
        String dbPassword = "hr";

        //create connection
        Connection connection = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);

        //create statement object
        Statement statement=connection.createStatement();

        // run query and get the result in resultSet object
        ResultSet resultSet= statement.executeQuery("select * from departments");

        //move pointer to first row
        resultSet.next();

        //System.out.println(resultSet.getString("region_name"));

        while (resultSet.next()){
            System.out.println(resultSet.getString(1)+" - "+resultSet.getString(2)+" - "+resultSet.getString(4));
        }

        //close all connections
        resultSet.close();
        statement.close();
        connection.close();
    }
}
