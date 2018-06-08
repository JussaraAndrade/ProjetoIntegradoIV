/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.db.dao;

import br.com.projeto.db.utils.ConnectionUtils;
import br.com.projeto.model.clientes.Cliente;
import br.com.projeto.model.produto.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Jussara Andrade
 */
public class DaoProduto {
     public static void inserir(Produto produto)
            throws SQLException, Exception  {
       
        
        String sql =  "INSERT INTO produto (nome_produto, departamento_produto, cor, tamanho_produto, descricao_produto, preco_produto, quant_estoque_produto, data_cadastro_produto) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?); ";
        
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
            preparedStatement.setInt(7, Integer.parseInt(produto.getQuantidade()));
            preparedStatement.setDate(8, new Date(System.currentTimeMillis()));
                       
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
//      public static List<Cliente> listarCliente()
//            throws SQLException, Exception {
//        
//        String sql = "SELECT * FROM cliente WHERE (enabled=?)";
//        
//        List<Cliente> listaClientes = null;
//        
//        
//        Connection connection = null;
//        
//        PreparedStatement preparedStatement = null;
//        
//        ResultSet result = null;
//        try {
//           
//            connection = ConnectionUtils.getConnection();
//           
//            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setBoolean(1, true);
//
//           
//            result = preparedStatement.executeQuery();
//
//            
//            while (result.next()) {
//                
//                if (listaClientes == null) {
//                    listaClientes = new ArrayList<Cliente>();
//                }
//               
//                Cliente cliente = new Cliente();
//                cliente.setId(result.getInt("id_cliente"));
//                cliente.setNome(result.getString("nome_cliente"));
//                cliente.setSexo(result.getString("sexo_cliente"));
//                cliente.setRg(result.getString("rg_cliente"));
//                cliente.setCpf(result.getString("cpf_cliente"));
//                cliente.setDataNasc(result.getTime("data_nasc_cliente"));
//                cliente.setEmail(result.getString("email_cliente"));
//                cliente.setCelular(result.getString("celular_cliente"));
//                cliente.setTelefone(result.getString("telefone_cliente"));
//                cliente.setRua(result.getString("rua_cliente"));
//                cliente.setNumero(result.getString("numero_cliente"));
//                cliente.setBairro(result.getString("bairro_cliente"));
//                cliente.setCidade(result.getString("cidade_cliente"));
//                cliente.setUf(result.getString("uf_cliente"));
//                cliente.setCep(result.getString("cep_cliente"));
//                cliente.setComplemento(result.getString("complemento_cliente"));
//               
//               
//                
//                listaClientes.add(cliente);
//            }
//        } finally {
//            
//            if (result != null && !result.isClosed()) {
//                result.close();
//            }
//           
//            if (preparedStatement != null && !preparedStatement.isClosed()) {
//                preparedStatement.close();
//            }
//            
//            if (connection != null && !connection.isClosed()) {
//                connection.close();
//            }
//        }
//       
//        return listaClientes;
//    }
//
//   
//    public static List<Cliente> procurarCliente(String nome)
//            throws SQLException, Exception {
//        
//        String sql = "SELECT * FROM mydb.cliente WHERE nome_cliente like ?";
//        
//        
//        List<Cliente> listaClientes = null;
//       
//        Connection connection = null;
//        
//        PreparedStatement preparedStatement = null;
//        
//        ResultSet result = null;
//        try {
//           
//            connection = ConnectionUtils.getConnection();
//           
//            preparedStatement = connection.prepareStatement(sql);
//            
//            preparedStatement.setString(1, "%" + nome + "%");
//           
//          
//            result = preparedStatement.executeQuery();
//            
//           
//            while (result.next()) {
//                
//                if (listaClientes == null) {
//                    listaClientes = new ArrayList<Cliente>();
//                }
//               
//                Cliente cliente = new Cliente();
//                cliente.setId(result.getInt("id_cliente"));
//                cliente.setNome(result.getString("nome_cliente"));
//                cliente.setSexo(result.getString("sexo_cliente"));
//                cliente.setRg(result.getString("rg_cliente"));
//                cliente.setCpf(result.getString("cpf_cliente"));
//                cliente.setDataNasc(result.getTime("data_nasc_cliente"));
//                cliente.setEmail(result.getString("email_cliente"));
//                cliente.setCelular(result.getString("celular_cliente"));
//                cliente.setTelefone(result.getString("telefone_cliente"));
////                cliente.setRua(result.getString("rua_cliente"));
////                cliente.setNumero(result.getString("numero_cliente"));
////                cliente.setCidade(result.getString("cidade_cliente"));
////                cliente.setUf(result.getString("uf_cliente"));
////                cliente.setCep(result.getString("cep_cliente"));
////                cliente.setComplemento(result.getString("complemento_cliente"));  
////                cliente.setIdEndereco(result.getInt("cliente_id_cliente"));                
//                
//               
//                listaClientes.add(cliente);
//            }
//        } finally {
//            
//            if (result != null && !result.isClosed()) {
//                result.close();
//            }
//           
//            if (preparedStatement != null && !preparedStatement.isClosed()) {
//                preparedStatement.close();
//            }
//           
//            if (connection != null && !connection.isClosed()) {
//                connection.close();
//            }
//        }
//        
//        return listaClientes;
//    }
//  
//    public static Cliente obter(Integer id) throws SQLException{
//        
//        String sql = "SELECT * FROM mydb.cliente WHERE (id_cliente=?)";
//        String sql2 = "SELECT * FROM mydb.end_cliente WHERE (cliente_id_cliente=?)";
//
//       
//        Connection connection = null;
//      
//        PreparedStatement preparedStatement = null;
//        
//        ResultSet result = null;
//        try {
//           
//            connection = ConnectionUtils.getConnection();
//           
//            preparedStatement = connection.prepareStatement(sql);
//          
//            preparedStatement.setInt(1, id);
//            preparedStatement.setBoolean(2, true);
//            
//            preparedStatement = connection.prepareStatement(sql2);
//          
//            preparedStatement.setInt(1, id);
//            preparedStatement.setBoolean(2, true);
//            
//         
//
//            
//            result = preparedStatement.executeQuery();
//
//           
//            if (result.next()) {
//              
//               Cliente cliente = new Cliente();
//                cliente.setId(result.getInt("id_cliente"));
//                cliente.setNome(result.getString("nome_cliente"));
//                cliente.setSexo(result.getString("sexo_cliente"));
//                cliente.setRg(result.getString("rg_cliente"));
//                cliente.setCpf(result.getString("cpf_cliente"));
//                cliente.setDataNasc(result.getTime("data_nasc_cliente"));
//                cliente.setEmail(result.getString("email_cliente"));
//                cliente.setCelular(result.getString("celular_cliente"));
//                cliente.setTelefone(result.getString("telefone_cliente"));
//                cliente.setRua(result.getString("rua_cliente"));
//                cliente.setNumero(result.getString("numero_cliente"));
//                cliente.setCidade(result.getString("cidade_cliente"));
//                cliente.setUf(result.getString("uf_cliente"));
//                cliente.setCep(result.getString("cep_cliente"));
//                cliente.setComplemento(result.getString("complemento_cliente"));   
//
//              
//                return cliente;
//            }
//        } finally {
//           
//            if (result != null && !result.isClosed()) {
//                result.close();
//            }
//           
//            if (preparedStatement != null && !preparedStatement.isClosed()) {
//                preparedStatement.close();
//            }
//           
//            if (connection != null && !connection.isClosed()) {
//                connection.close();
//            }
//        }
//
//        
//        return null;
//    }


}
   
    

