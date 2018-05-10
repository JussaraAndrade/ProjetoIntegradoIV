/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.db.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Jussara Andrade
 */
public class ConnectionUtils {
        
    public static Connection getConnection() {
        
        Connection connection = null;
        try {
                      
           
            String dbURL = "jdbc:mysql://localhost:3306/mydb";
           
            Properties properties = new Properties();
            properties.put("user", "root");
            properties.put("password", "root");
           
            connection = DriverManager.getConnection(dbURL, properties);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        //Retorna a conexão
        return connection;
    }

    
}
