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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jussara Andrade
 */
public class DaoCliente {

    public static void inserir(Cliente cliente, Endereco endereco)
            throws SQLException, Exception  {
       
        
        String sql =  "INSERT INTO mydb.cliente (nome_cliente, sexo_cliente, rg_cliente, cpf_cliente, data_nasc_cliente, email_cliente, celular_cliente, telefone_cliente, data_cadastro_cliente) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?); ";
        
        String sql2 = "INSERT INTO mydb.end_cliente (rua_cliente, numero_cliente, bairro_cliente, cidade_cliente, uf_cliente, cep_cliente, complemento_cliente, cliente_id_cliente)"
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
 
        
        Connection connection = null;
       
        PreparedStatement preparedStatement = null;
        
        
        try {
          
            connection = ConnectionUtils.getConnection();
            connection.setAutoCommit(false);
           
            
            preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getSexo());
            preparedStatement.setString(3, cliente.getRg());
            preparedStatement.setString(4, cliente.getCpf());
            Timestamp t = new Timestamp(cliente.getDataNasc().getTime());
            preparedStatement.setTimestamp(5, t);
            preparedStatement.setString(6, cliente.getEmail());
            preparedStatement.setString(7, cliente.getCelular());
            preparedStatement.setString(8, cliente.getTelefone());
            t = new Timestamp((new Date()).getTime());
            preparedStatement.setTimestamp(9, t);
            
            preparedStatement.execute();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            rs.next();
            int idCliente = rs.getInt(1);
            
            
            preparedStatement = connection.prepareStatement(sql2, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, endereco.getRua());
            preparedStatement.setString(2, endereco.getNumero());
            preparedStatement.setString(3, endereco.getBairro());
            preparedStatement.setString(4, endereco.getCidade());
            preparedStatement.setString(5, endereco.getUf());
            preparedStatement.setLong(6, Long.parseLong(endereco.getCep().replaceAll("-", "")));
            preparedStatement.setString(7, endereco.getComplemento());
            preparedStatement.setInt(8, idCliente);
            
            preparedStatement.execute();
            connection.commit();
            
            
        }
        catch(Exception e) {
            connection.rollback();
            throw e;
        }
        finally {
            
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
          
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
    
    
    
     public static void atualizar(Cliente cliente, Endereco endereco)
            throws SQLException, Exception {
        
       String sql =  "UPDATE mydb.cliente SET nome_cliente=?, sexo_cliente=?, rg_cliente=?, cpf_cliente=?, data_nasc_cliente=?, email_cliente=?, celular_cliente=?, telefone_cliente=?) "
                + "WHERE(id_cliente=?)";
        
        String sql2 = "UPDATE mydb.end_cliente (rua_cliente=?, numero_cliente=?, bairro_cliente=?, cidade_cliente=?, uf_cliente=?, cep_cliente=?, complemento_cliente=?)"
                + "WHERE(cliente_id_cliente=?);";
              
        
        Connection connection = null;
       
        PreparedStatement preparedStatement = null;
        try {
           
            connection = ConnectionUtils.getConnection();
            connection.setAutoCommit(false);
           
            
            preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(0, cliente.getId());
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getSexo());
            preparedStatement.setString(3, cliente.getRg());
            preparedStatement.setString(4, cliente.getCpf());
            Timestamp t = new Timestamp(cliente.getDataNasc().getTime());
            preparedStatement.setTimestamp(5, t);
            preparedStatement.setString(6, cliente.getEmail());
            preparedStatement.setString(7, cliente.getCelular());
            preparedStatement.setString(8, cliente.getTelefone());
            preparedStatement.setBoolean(9, true);
            t = new Timestamp((new Date()).getTime());
            preparedStatement.setTimestamp(10, t);
            
            
            preparedStatement.execute();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            rs.next();
            int idCliente = rs.getInt(1);
            
            
            preparedStatement = connection.prepareStatement(sql2, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, endereco.getRua());
            preparedStatement.setString(2, endereco.getNumero());
            preparedStatement.setString(3, endereco.getBairro());
            preparedStatement.setString(4, endereco.getCidade());
            preparedStatement.setString(5, endereco.getUf());
            preparedStatement.setLong(6, Long.parseLong(endereco.getCep().replaceAll("-", "")));
            preparedStatement.setString(7, endereco.getComplemento());
            preparedStatement.setInt(8, idCliente);
            
             preparedStatement.execute();
             connection.commit();
            
             
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
     public static List<Endereco> listarEndereco()
            throws SQLException, Exception {
        
        String sql = "SELECT * FROM end_cliente WHERE (enabled=?)";
       
        List<Endereco> listaEndereco = null;
        
        Connection connection = null;
        
        PreparedStatement preparedStatement = null;
        
        ResultSet result = null;
        try {
           
            connection = ConnectionUtils.getConnection();
           
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, true);

           
            result = preparedStatement.executeQuery();

            
            while (result.next()) {
                
                if (listaEndereco == null) {
                    listaEndereco = new ArrayList<Endereco>();
                }
                Endereco endereco = new Endereco();
                
                
                endereco.setRua(result.getString(""));
                endereco.setNumero(result.getString(""));
                endereco.setBairro(result.getString(""));
                endereco.setCidade(result.getString(""));
                endereco.setUf(result.getString(""));
                endereco.setCep(result.getString(""));
                endereco.setComplemento(result.getString(""));
                endereco.setId(result.getInt(""));
                
                listaEndereco.add(endereco);
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
       
        return listaEndereco;
    }


   
    public static List<Cliente> listarCliente()
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

   
    public static List<Cliente> procurarCliente(String valor)
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
     public static List<Endereco> procurarEndereco(String valor)
            throws SQLException, Exception {
        
        String sql = "SELECT * FROM cliente WHERE ((UPPER(nome) LIKE UPPER(?) "
                + "OR UPPER(cliente.cpf) LIKE UPPER(?)) AND enabled=?)";
        
        List<Endereco> listaEndereco = null;
       
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
                
                if (listaEndereco == null) {
                    listaEndereco = new ArrayList<Endereco>();
                }
                
//                    private Integer id;
//    private String rua;
//    private String numero;
//    private String bairro;
//    private String cidade;
//    private String uf;
//    private String cep;
//    private String complemento;
               
                Endereco endereco = new Endereco();
                endereco.setId(result.getInt("id_endereco"));
                endereco.setRua(result.getString("rua_endereco"));
                endereco.setNumero(result.getString("numero_endereco"));
                endereco.setBairro(result.getString("bairro_endereco"));
                endereco.setCidade(result.getString("cidade_endereco"));
                endereco.setUf(result.getString("uf_endereco"));
                endereco.setCep(result.getString("cep_endereco"));
                endereco.setComplemento(result.getString("complemento_endereco"));
                listaEndereco.add(endereco);
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
        
        return  listaEndereco;
    }
   
    public static Cliente obter(Integer id) throws SQLException{
        
        String sql = "SELECT * FROM cliente.myb WHERE (id_cliente=?)";

       
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
   

       