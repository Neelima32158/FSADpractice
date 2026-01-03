package com.fsads52.jdbc_create;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc27",
                "root",
                "#Neelima42207"
            );

            System.out.println("✅ Database connected successfully");

            con.close();

        } catch (Exception e) {
            System.out.println("❌ Database NOT connected");
            e.printStackTrace();
        }
    }
}
