/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.promanage.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class DBHelper {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/promanage_db";
    private static final String USER = "root"; // ganti sesuai MySQL kamu
    private static final String PASSWORD = ""; // isi password jika ada

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL Driver not found", e);
        }

        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }
}
