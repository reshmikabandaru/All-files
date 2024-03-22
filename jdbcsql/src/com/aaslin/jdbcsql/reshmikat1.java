
package com.aaslin.jdbcsql;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class reshmikat1 {

    static Connection con = null;
    static Statement st = null;
    static ResultSet rs = null;
    static List<employee1> obj = new ArrayList<>();

    public static List<employee1> fun(String q) {
        try {
            rs = st.executeQuery(q);
            while (rs.next()) {
                employee1 e = new employee1();
                System.out.println();
                department1 d = new department1();

                e.setId(rs.getInt(1));
                e.setName(rs.getString(2));
                d.setId(rs.getInt(3)); 
                d.setName(rs.getString(4)); 

                e.setDept(d);
                obj.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_management1", "root", "root");
            System.out.println("JDBC connection success");
            st = con.createStatement();
            String q = "SELECT e.id, e.name, d.did, d.Dname FROM employee1 e INNER JOIN department1 d ON e.did=d.did";
            List<employee1> r = fun(q);
            for (employee1 e : r) {
                System.out.println(e.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
