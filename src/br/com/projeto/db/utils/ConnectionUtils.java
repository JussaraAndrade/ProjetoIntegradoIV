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

//Obtém um objeto de conexão do banco de dados.
//Pode ser utilizado para abertura e fechamento de conexões com o banco
public class ConnectionUtils {

    //Obtém uma conexão do banco de dados
    public static Connection getConnection() {
        //Conexão para abertura e fechamento
        Connection connection = null;
        try {
            //Só tenta abrir uma conexão se não existir ou estiver fechada            
            //Endereço de conexão com o banco de dados
            String dbURL = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
            
            //Propriedades para armazenamento de usuário e senha
            Properties properties = new Properties();
            properties.put("user", "root");
            properties.put("password", "adminadmin");
            //Realiza a conexão com o banco
            connection = DriverManager.getConnection(dbURL, properties);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        //Retorna a conexão
        return connection;
    }

    
}