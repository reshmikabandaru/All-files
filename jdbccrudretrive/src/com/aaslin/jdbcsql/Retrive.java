package com.aaslin.jdbcsql;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Retrive{
	    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/employee_mgmt";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "root";
	    private static final String TABLE_NAME = "employee";

	    public static void main(String[] args) {
	        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
	             Statement statement = connection.createStatement();
	             ResultSet resultSet = statement.executeQuery("SELECT * FROM " + TABLE_NAME)) {

	            // Print column headers
	            for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
	                System.out.print(resultSet.getMetaData().getColumnLabel(i) + "\t");
	            }
	            System.out.println();

	            // Print records
	            while (resultSet.next()) {
	                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
	                    System.out.print(resultSet.getString(i) + "\t");
	                }
	                System.out.println();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}



