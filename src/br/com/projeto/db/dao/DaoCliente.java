/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.db.dao;

import br.com.projeto.db.utils.ConnectionUtils;
import br.com.projeto.model.clientes.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author Jussara Andrade
 */
public class DaoCliente {
    //Insere um cliente na tabela "cliente" do banco de dados

    public static void inserir(Cliente cliente)
            throws SQLException, Exception {
        //Monta a string de inserção de um cliente no BD,
        //utilizando os dados do clientes passados como parâmetro
         String sql =  "INSERT INTO cliente (nome_cliente, sexo_cliente, rg_cliente, cpf_cliente, data_nasc_cliente, email_cliente, celular_cliente, telefone_cliente, data_cadastro_cliente, enable)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
               
         Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        
       
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, cliente.getNomeCliente());
            preparedStatement.setString(2, cliente.getSexoCliente());
            preparedStatement.setString(3, cliente.getRgCliente());
            preparedStatement.setString(4, cliente.getCpfCliente());
            preparedStatement.setDate(5, new Date(cliente.getDataNascimentoCliente().getTime()));        
            preparedStatement.setString(6, cliente.getEmailCliente());
            preparedStatement.setString(7, cliente.getCelularCliente());
            preparedStatement.setString(8, cliente.getTelefoneCliente());
            preparedStatement.setDate(9, new Date (cliente.getDataCadastroCliente().getTime()));   
            preparedStatement.setBoolean(10, true);
      
            preparedStatement.execute();
            
             } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        
      
    }
}

       