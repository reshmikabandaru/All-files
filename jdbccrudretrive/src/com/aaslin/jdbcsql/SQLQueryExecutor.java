package com.aaslin.jdbcsql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLQueryExecutor {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/employee_mgmt";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static ResultSet fun(String sqlQuery) {
        ResultSet resultSet = null; 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            Statement stm = connection.createStatement();
            resultSet = stm.executeQuery(sqlQuery);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public static void main(String[] args) {
        try {
            String query = "select * from department";
            ResultSet resultSet = fun(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("deptid") + " " + resultSet.getString("deptname"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
