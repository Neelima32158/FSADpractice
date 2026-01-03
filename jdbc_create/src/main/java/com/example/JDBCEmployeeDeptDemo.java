package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCEmployeeDeptDemo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc27?useSSL=false&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "#Neelima42207"; // change if needed

        try {
            // Connect
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Database!");

            Statement st = con.createStatement();

            // Create Dept table
            String createDept =
                "CREATE TABLE IF NOT EXISTS dept1 (" +
                "dept_id INT PRIMARY KEY, " +
                "dept_name VARCHAR(50))";
            st.executeUpdate(createDept);

            // Create Employee table
            String createEmp =
                "CREATE TABLE IF NOT EXISTS employee1 (" +
                "emp_id INT PRIMARY KEY, " +
                "emp_name VARCHAR(50), " +
                "salary DOUBLE, " +
                "dept_id INT, " +
                "FOREIGN KEY (dept_id) REFERENCES dept1(dept_id))";
            st.executeUpdate(createEmp);

            // Clear old data (avoid duplicate key error)
            st.executeUpdate("DELETE FROM employee1");
            st.executeUpdate("DELETE FROM dept1");

            // Insert into dept FIRST
            st.executeUpdate("INSERT INTO dept1 VALUES (1, 'HR')");
            st.executeUpdate("INSERT INTO dept1 VALUES (2, 'Finance')");
            st.executeUpdate("INSERT INTO dept1 VALUES (3, 'IT')");
            System.out.println("Dept values inserted.");

            // Insert into employee
            st.executeUpdate("INSERT INTO employee1 VALUES (101, 'Alice', 50000, 1)");
            st.executeUpdate("INSERT INTO employee1 VALUES (102, 'Bob', 60000, 2)");
            st.executeUpdate("INSERT INTO employee1 VALUES (103, 'Charlie', 70000, 3)");
            System.out.println("Employee values inserted.");

            con.close();
            System.out.println("Done and Connection Closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



