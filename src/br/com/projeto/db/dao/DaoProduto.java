/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.db.dao;

import br.com.projeto.db.utils.ConnectionUtils;
import br.com.projeto.model.produto.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author Jussara Andrade
 */
public class DaoProduto {
     public static void inserir(Produto produto)
            throws SQLException, Exception  {
       
        
        String sql =  "INSERT INTO produto (nome_produto, departamento_produto, cor, tamanho_produto, descricao_produto, preco_produto, quant_estoque_produto, data_cadastro_produto, enable) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?); ";
        
        Connection connection = null;
       
        PreparedStatement preparedStatement = null;
        
        try {
            
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setString(2, produto.getDepartamento());
            preparedStatement.setString(3, produto.getCor());
            preparedStatement.setString(4, produto.getTamanho());
            preparedStatement.setString(5, produto.getDescricao());
            preparedStatement.setString(6, produto.getPreco());
            preparedStatement.setString(7, produto.getQuantidade());
            Timestamp t = new Timestamp(produto.getData().getTime());
            preparedStatement.setTimestamp(8, t);
            preparedStatement.setBoolean(9, true);
           
             preparedStatement.execute();
             
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
          
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
    
}
