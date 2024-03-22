package com.aaslin.jdbcsql;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLConnection {
	
	

	    public static void main(String[] args) throws ClassNotFoundException {
	       
	        String url = "jdbc:mysql://localhost:3306/employee_mgmt";
	        String user = "root";
	        String password = "root";
          
              
              
              
	      try {
	        	 Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection connection = DriverManager.getConnection(url, user, password);
	            System.out.println("Connection to MySQL database established successfully!");
	          
	            connection.close();
	        } catch (SQLException e)
	        {
	            System.err.println("Failed to connect to MySQL database!");
	            e.printStackTrace();
	        }
	   
		
		}
	      
	      
}      
	      
	      
	      
	      
	      
	      






