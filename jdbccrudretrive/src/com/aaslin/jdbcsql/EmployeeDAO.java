package com.aaslin.jdbcsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAO {
    private Connection con;
    private Statement st;

    public void show() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee_mgmt",
                    "root", "root");
            System.out.println("Connection established");
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void insert() {
        try {
            String query = "INSERT INTO department VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 7);
            ps.setString(2, "HR");
            ps.executeUpdate();
            System.out.println("Record inserted successfully!");
        } catch (SQLException e) {
            System.err.println("Error inserting record!");
            e.printStackTrace();
        }
    }
    
    
    
    
    public void update() {
        try {
            String query = "UPDATE department SET deptname=? WHERE deptid=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "technical"); 
            ps.setInt(2, 2); 
            ps.executeUpdate();
            System.out.println("Record updated successfully!");
        } catch (SQLException e) {
            System.err.println("Error updating record!");
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        EmployeeDAO da = new EmployeeDAO();
        da.show();
        da.insert();
        da.update();
    }
}
