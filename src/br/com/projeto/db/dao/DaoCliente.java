/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.db.dao;

import br.com.projeto.db.utils.ConnectionUtils;
import br.com.projeto.model.clientes.Cliente;
import br.com.projeto.model.clientes.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author Jussara Andrade
 */
public class DaoCliente {
    
    
     

    public static void inserir(Cliente cliente, Endereco endereco)
            throws SQLException, Exception  {
       
        
        String sql =  "START TRANSACTION; "
                + "INSERT INTO mydb.cliente (nome_cliente, sexo_cliente, rg_cliente, cpf_cliente, data_nasc_cliente, email_cliente, celular_cliente, telefone_cliente, data_cadastro_cliente, enable) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?); "
                + "INSERT INTO mydb.end_cliente (rua_cliente, numero_cliente, bairro_cliente, cidade_cliente, uf_cliente, cep_cliente, complemento_cliente, cliente_id_cliente) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?,(SELECT LAST_INSERT_ID()));";
        
        Connection connection = null;
       
        PreparedStatement preparedStatement = null;
        try {
          
            connection = ConnectionUtils.getConnection();
           
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getSexo());
            preparedStatement.setString(3, cliente.getRg());
            preparedStatement.setString(4, cliente.getCpf());
            preparedStatement.setDate(5, new java.sql.Date(cliente.getDataNasc().getTime()));
            preparedStatement.setString(6, cliente.getEmail());
            preparedStatement.setString(7, cliente.getCelular());
            preparedStatement.setString(8, cliente.getTelefone());
            preparedStatement.setDate(9, new java.sql.Date(cliente.getDataCadastro().getTime())); 
            preparedStatement.setBoolean(10, true);
            
          
            preparedStatement.setString(1, endereco.getRua());
            preparedStatement.setString(2, endereco.getNumero());
            preparedStatement.setString(3, endereco.getComplemento());
            preparedStatement.setString(4, endereco.getBairro());
            preparedStatement.setString(5, endereco.getUf());
            preparedStatement.setString(6, endereco.getCidade());
            preparedStatement.setString(7, endereco.getCep());
          
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
    
    
     public static void atualizar(Cliente cliente)
            throws SQLException, Exception {
        
       
       
        String sql = "UPDATE cliente SET nome_cliente=?, sexo_cliente=?, rg_cliente=?, cpf_cliente=?, "
                +"rg_cliente=?, cpf_cliente=?, data_nasc_cliente=?, email_cliente=?, celular_cliente=?, "
                +"telefone_cliente=? WHERE (cliente_id=?)";
        
        Connection connection = null;
       
        PreparedStatement preparedStatement = null;
        try {
           
            connection = ConnectionUtils.getConnection();
            
            preparedStatement = connection.prepareStatement(sql);
          
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getSexo());
            preparedStatement.setString(3, cliente.getRg());
            preparedStatement.setString(4, cliente.getCpf());
            preparedStatement.setDate(5, new java.sql.Date(cliente.getDataNasc().getTime()));
            preparedStatement.setString(6, cliente.getEmail());
            preparedStatement.setString(7, cliente.getCelular());
            preparedStatement.setString(8, cliente.getTelefone());
            preparedStatement.setInt(9, cliente.getId());
            
             
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
     public static void excluir(Integer id) throws SQLException, Exception {
      
        String sql = "UPDATE cliente SET enabled=? WHERE (cliente_id=?)";
       
        Connection connection = null;
       
        PreparedStatement preparedStatement = null;
        try {
           
            connection = ConnectionUtils.getConnection();
            
            preparedStatement = connection.prepareStatement(sql);
           
            preparedStatement.setBoolean(1, false);
            preparedStatement.setInt(2, id);

            
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

   
    public static List<Cliente> listar()
            throws SQLException, Exception {
        
        String sql = "SELECT * FROM cliente WHERE (enabled=?)";
        
        List<Cliente> listaClientes = null;
        
        Connection connection = null;
        
        PreparedStatement preparedStatement = null;
        
        ResultSet result = null;
        try {
           
            connection = ConnectionUtils.getConnection();
           
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, true);

           
            result = preparedStatement.executeQuery();

            
            while (result.next()) {
                
                if (listaClientes == null) {
                    listaClientes = new ArrayList<Cliente>();
                }
               
                Cliente cliente = new Cliente();
                cliente.setId(result.getInt("id_cliente"));
                cliente.setNome(result.getString("nome_cliente"));
                cliente.setSexo(result.getString("sexo_cliente"));
                cliente.setRg(result.getString("rg_cliente"));
                cliente.setCpf(result.getString("cpf_cliente"));
                cliente.setDataNasc(result.getTime("data_nasc_cliente"));
                cliente.setEmail(result.getString("email_cliente"));
                cliente.setCelular(result.getString("celular_cliente"));
                cliente.setTelefone(result.getString("telefone_cliente"));
               
                
                listaClientes.add(cliente);
            }
        } finally {
            
            if (result != null && !result.isClosed()) {
                result.close();
            }
           
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
       
        return listaClientes;
    }

   
    public static List<Cliente> procurar(String valor)
            throws SQLException, Exception {
        
        String sql = "SELECT * FROM cliente WHERE ((UPPER(nome) LIKE UPPER(?) "
                + "OR UPPER(cliente.cpf) LIKE UPPER(?)) AND enabled=?)";
        
        List<Cliente> listaClientes = null;
       
        Connection connection = null;
        
        PreparedStatement preparedStatement = null;
        
        ResultSet result = null;
        try {
           
            connection = ConnectionUtils.getConnection();
           
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, "%" + valor + "%");
            preparedStatement.setString(2, "%" + valor + "%");
            preparedStatement.setBoolean(3, true);

            result = preparedStatement.executeQuery();

            
            while (result.next()) {
                
                if (listaClientes == null) {
                    listaClientes = new ArrayList<Cliente>();
                }
               
                Cliente cliente = new Cliente();
                cliente.setId(result.getInt("id_cliente"));
                cliente.setNome(result.getString("nome_cliente"));
                cliente.setSexo(result.getString("sexo_cliente"));
                cliente.setRg(result.getString("rg_cliente"));
                cliente.setCpf(result.getString("cpf_cliente"));
                cliente.setDataNasc(result.getTime("data_nasc_cliente"));;
                cliente.setEmail(result.getString("email_cliente"));
                cliente.setCelular(result.getString("celular_cliente"));
                cliente.setTelefone(result.getString("telefone_cliente"));
               
                listaClientes.add(cliente);
            }
        } finally {
            
            if (result != null && !result.isClosed()) {
                result.close();
            }
           
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
           
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        
        return listaClientes;
    }

   
    public static Cliente obter(Integer id) throws SQLException{
        
        String sql = "SELECT * FROM cliente WHERE (id_cliente=? AND enabled=?)";

       
        Connection connection = null;
      
        PreparedStatement preparedStatement = null;
        
        ResultSet result = null;
        try {
           
            connection = ConnectionUtils.getConnection();
           
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, id);
            preparedStatement.setBoolean(2, true);

            
            result = preparedStatement.executeQuery();

           
            if (result.next()) {
              
               Cliente cliente = new Cliente();
                cliente.setId(result.getInt("id_cliente"));
                cliente.setNome(result.getString("nome_cliente"));
                cliente.setSexo(result.getString("sexo_cliente"));
                cliente.setRg(result.getString("rg_cliente"));
                cliente.setCpf(result.getString("cpf_cliente"));
                cliente.setDataNasc(result.getTime("data_nasc_cliente"));
                cliente.setEmail(result.getString("email_cliente"));
                cliente.setCelular(result.getString("celular_cliente"));
                cliente.setTelefone(result.getString("telefone_cliente"));

              
                return cliente;
            }
        } finally {
           
            if (result != null && !result.isClosed()) {
                result.close();
            }
           
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
           
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }

        
        return null;
    }

    

  


}
   

       