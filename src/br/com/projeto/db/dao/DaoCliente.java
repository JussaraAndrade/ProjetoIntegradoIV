/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.db.dao;

import br.com.projeto.db.utils.ConnectionUtils;
import br.com.projeto.model.clientes.Cliente;
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

    public static void inserirClinte(Cliente cliente)
            throws SQLException, Exception {

        String sql = "INSERT INTO mydb.cliente (nome_cliente, sexo_cliente, rg_cliente, cpf_cliente, data_nasc_cliente, email_cliente, celular_cliente, telefone_cliente, data_cadastro_cliente, enable_cliente) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ";

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
            t = new Timestamp((new java.util.Date()).getTime());
            preparedStatement.setTimestamp(9, t);
            preparedStatement.setBoolean(10, true);

            preparedStatement.execute();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            rs.next();
            int idCliente = rs.getInt(1);

            preparedStatement = connection.prepareStatement(sql2, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, cliente.getRua());
            preparedStatement.setString(2, cliente.getNumero());
            preparedStatement.setString(3, cliente.getBairro());
            preparedStatement.setString(4, cliente.getCidade());
            preparedStatement.setString(5, cliente.getUf());
            preparedStatement.setLong(6, Long.parseLong(cliente.getCep().replaceAll("-", "")));
            preparedStatement.setString(7, cliente.getComplemento());
            preparedStatement.setInt(8, idCliente);

            preparedStatement.execute();
            connection.commit();

        } catch (Exception e) {
            connection.rollback();
            throw e;
        } finally {

            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }

            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

   

    public static List<Cliente> listarCliente()
            throws SQLException, Exception {

        String sql = "SELECT * FROM mydb.cliente INNER JOIN mydb.end_cliente ON mydb.cliente.id_cliente = mydb.end_cliente.cliente_id_cliente WHERE nome_cliente like ?";

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
                cliente.setIdCliente(result.getInt("id_cliente"));
                cliente.setNome(result.getString("nome_cliente"));
                cliente.setSexo(result.getString("sexo_cliente"));
                cliente.setRg(result.getString("rg_cliente"));
                cliente.setCpf(result.getString("cpf_cliente"));
                Date d = new Date(result.getTimestamp("data_nasc_cliente").getTime());
                cliente.setDataNasc(d);
                cliente.setEmail(result.getString("email_cliente"));
                cliente.setCelular(result.getString("celular_cliente"));
                cliente.setTelefone(result.getString("telefone_cliente"));
                cliente.setEnable(result.getBoolean("enable_cliente"));
                cliente.setRua(result.getString("rua_cliente"));
                cliente.setNumero(result.getString("numero_cliente"));
                cliente.setBairro(result.getString("bairro_cliente"));
                cliente.setCidade(result.getString("cidade_cliente"));
                cliente.setCep(result.getString("cep_cliente"));
                cliente.setUf(result.getString("uf_cliente"));
                cliente.setComplemento(result.getString("complemento_cliente"));

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

    public static Cliente obterCliente(Integer id) throws SQLException {

        String sql = "SELECT * FROM mydb.cliente INNER JOIN mydb.end_cliente ON mydb.cliente.id_cliente = mydb.end_cliente.cliente_id_cliente WHERE nome_cliente like ?";
        

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
                cliente.setIdCliente(result.getInt("id_cliente"));
                cliente.setNome(result.getString("nome_cliente"));
                cliente.setSexo(result.getString("sexo_cliente"));
                cliente.setRg(result.getString("rg_cliente"));
                cliente.setCpf(result.getString("cpf_cliente"));
                java.util.Date d = new java.util.Date(result.getTimestamp("data_nasc_cliente").getTime());
                cliente.setDataNasc(d);
                cliente.setEmail(result.getString("email_cliente"));
                cliente.setCelular(result.getString("celular_cliente"));
                cliente.setTelefone(result.getString("telefone_cliente"));
                cliente.setEnable(result.getBoolean("enable_cliente"));
                cliente.setRua(result.getString("rua_cliente"));
                cliente.setNumero(result.getString("numero_cliente"));
                cliente.setBairro(result.getString("bairro_cliente"));
                cliente.setCidade(result.getString("cidade_cliente"));
                cliente.setCep(result.getString("cep_cliente"));
                cliente.setUf(result.getString("uf_cliente"));
                cliente.setComplemento(result.getString("complemento_cliente"));

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

    public static List<Cliente> procurarCliente(String nome)
            throws SQLException, Exception {

        String sql = "SELECT * FROM mydb.cliente INNER JOIN mydb.end_cliente ON mydb.cliente.id_cliente = mydb.end_cliente.cliente_id_cliente WHERE nome_cliente like ?";

        List<Cliente> listaCliente = null;

        Connection connection = null;

        PreparedStatement preparedStatement = null;

        ResultSet result = null;
        try {

            connection = ConnectionUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, "%" + nome + "%");

            result = preparedStatement.executeQuery();

            while (result.next()) {

                if (listaCliente == null) {
                    listaCliente = new ArrayList<Cliente>();
                }
                Cliente cliente = new Cliente();

                cliente.setIdCliente(result.getInt("id_cliente"));
                cliente.setNome(result.getString("nome_cliente"));
                cliente.setSexo(result.getString("sexo_cliente"));
                cliente.setRg(result.getString("rg_cliente"));
                cliente.setCpf(result.getString("cpf_cliente"));
                java.util.Date d = new java.util.Date(result.getTimestamp("data_nasc_cliente").getTime());
                cliente.setDataNasc(d);
                cliente.setEmail(result.getString("email_cliente"));
                cliente.setCelular(result.getString("celular_cliente"));
                cliente.setTelefone(result.getString("telefone_cliente"));
                cliente.setEnable(result.getBoolean("enable_cliente"));
                cliente.setRua(result.getString("rua_cliente"));
                cliente.setNumero(result.getString("numero_cliente"));
                cliente.setBairro(result.getString("bairro_cliente"));
                cliente.setCidade(result.getString("cidade_cliente"));  
                cliente.setCep(result.getString("cep_cliente"));
                cliente.setUf(result.getString("uf_cliente"));
                cliente.setComplemento(result.getString("complemento_cliente")); 
                listaCliente.add(cliente);
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

        return listaCliente;

    

}
 public static void atualizarCliente(Cliente cliente)
            throws SQLException, Exception {

        String sql = "UPDATE mydb.cliente SET nome_cliente=?, sexo_cliente=?, rg_cliente=?, cpf_cliente=?, data_nasc_cliente=?, email_cliente=?, celular_cliente=?, telefone_cliente=?) "
                + "WHERE(id_cliente=?)";

        String sql2 = "UPDATE mydb.end SET rua_cliente=?, numero_cliente=?, bairro_cliente=?, cidade_cliente=?, uf_cliente=?, cep_cliente=?, complemento_cliente=?)"
                + "WHERE(cliente_id_cliente=?);";

        Connection connection = null;

        PreparedStatement preparedStatement = null;
        try {

            connection = ConnectionUtils.getConnection();
            connection.setAutoCommit(false);

            preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(0, cliente.getIdCliente());
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getSexo());
            preparedStatement.setString(3, cliente.getRg());
            preparedStatement.setString(4, cliente.getCpf());
//            Timestamp t = new Timestamp(cliente.getDataNasc().getTime());
//            preparedStatement.setTimestamp(5, t);
            preparedStatement.setTimestamp(5, new Timestamp(cliente.getDataNasc().getTime()));
            preparedStatement.setString(6, cliente.getEmail());
            preparedStatement.setString(7, cliente.getCelular());
            preparedStatement.setString(8, cliente.getTelefone());
            preparedStatement.setBoolean(9, true);
            preparedStatement.setDate(10, new java.sql.Date(System.currentTimeMillis()));
//            t = new Timestamp((new Date()).getTime());
//            preparedStatement.setTimestamp(10, t);

            preparedStatement.execute();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            rs.next();
            int idCliente = rs.getInt(1);

            preparedStatement = connection.prepareStatement(sql2, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, cliente.getRua());
            preparedStatement.setString(2, cliente.getNumero());
            preparedStatement.setString(3, cliente.getBairro());
            preparedStatement.setString(4, cliente.getCidade());
            preparedStatement.setString(5, cliente.getUf());
            preparedStatement.setLong(6, Long.parseLong(cliente.getCep().replaceAll("-", "")));
            preparedStatement.setString(7, cliente.getComplemento());
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

    public static void excluirCliente(String nome) throws SQLException, Exception {

        String sql = "DELETE FROM mydb.cliente WHERE (id_cliente=?);";
        String sq2 = "DELETE FROM mydb.cliente WHERE (id_cliente=?);";
        
        
        Connection connection = null;

        PreparedStatement preparedStatement = null;
        try {

            connection = ConnectionUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);

              preparedStatement.setString(1, nome);

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