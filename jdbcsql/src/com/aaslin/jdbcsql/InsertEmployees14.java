package com.aaslin.jdbcsql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InsertEmployees14 {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/emp_management1";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_management1", "root", "root");
            System.out.println("CONNECTED TO DATABASE");

            
            List<String> employees = new ArrayList<>();
            employees.add("msdhoni");
            employees.add("viratkohli");
            employees.add("shami");
            employees.add("rohitsharma");

            // CREATION OF STRING BUILDER
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO employee1 (name, did) VALUES ");

            // ITERATING
            for (String employee : employees) {
                sql.append("('").append(employee).append("', 1),");
            }
            sql.deleteCharAt(sql.length() - 1); 

            stmt = conn.createStatement();
            int rowsInserted = stmt.executeUpdate(sql.toString());
            System.out.println(rowsInserted + " ROWS INSERTED");

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
        	try {
            	
            	
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("INSERTION COMPLETED");
    }
}
