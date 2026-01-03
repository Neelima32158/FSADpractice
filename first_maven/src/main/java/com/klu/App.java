package com.klu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/",
                "root",
                "#Neelima42207"
            );

            Statement stmt = con.createStatement();

            // Create DB
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS student");

            // Use DB
            stmt.execute("USE student");

            // Create table
            stmt.executeUpdate(
                "CREATE TABLE IF NOT EXISTS student_table (" +
                "id INT PRIMARY KEY, " +
                "name VARCHAR(50), " +
                "age INT)"
            );

            // Insert data
            stmt.executeUpdate(
                "INSERT INTO student_table VALUES (1, 'Neelima', 20)"
            );

            System.out.println("✅ SUCCESS: Database, table & data created");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
