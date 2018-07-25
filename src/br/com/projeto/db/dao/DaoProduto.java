
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
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jussara Andrade
 */
public class DaoProduto {

    public static void inserirProduto(Produto produto)
            throws SQLException, Exception {

        String sql = "INSERT INTO produto (codigobarras, nome_produto, departamento_produto, cor, tamanho_produto, descricao_produto, preco_produto, quant_estoque_produto, data_cadastro_produto, enable_produto) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        Connection connection = null;

        PreparedStatement preparedStatement = null;

        try {

            connection = ConnectionUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, produto.getCodigobarras());
            preparedStatement.setString(2, produto.getNome());
            preparedStatement.setString(3, produto.getDepartamento());
            preparedStatement.setString(4, produto.getCor());
            preparedStatement.setString(5, produto.getTamanho());
            preparedStatement.setString(6, produto.getDescricao());
            preparedStatement.setString(7, produto.getPreco());
            preparedStatement.setInt(8, Integer.parseInt(produto.getQuantidade()));
            preparedStatement.setDate(9, new Date(System.currentTimeMillis()));
            preparedStatement.setBoolean(10, true);

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
     public static List<Produto> listarProduto()
            throws SQLException, Exception {
        
        String sql = "SELECT * FROM mydb.produto WHERE (enable_produto=?)";
        
        List<Produto> listaProdutos = null;
       
        Connection connection = null;
       
        PreparedStatement preparedStatement = null;
        
        ResultSet result = null;
        try {
            
            connection = ConnectionUtils.getConnection();
          
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, true);

           
            result = preparedStatement.executeQuery();

          
            while (result.next()) {
                
                if (listaProdutos == null) {
                    listaProdutos = new ArrayList<Produto>();
                }
               
                Produto produto = new Produto();
                produto.setIdProduto(result.getInt("id_produto"));
                produto.setCodigobarras(result.getString("codigobarras"));
                produto.setNome(result.getString("nome_produto"));
                produto.setDepartamento(result.getString("departamento_produto"));
                produto.setCor(result.getString("cor"));
                produto.setTamanho(result.getString("tamanho_produto"));
                produto.setDescricao(result.getString("descricao_produto"));
                produto.setPreco(result.getString("preco_produto"));
                produto.setQuantidade(result.getString("quant_estoque_produto"));
                produto.setEnable(result.getBoolean("enable_produto"));
               
                listaProdutos.add(produto);
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
        
        return listaProdutos;
    }


    public static List<Produto> procurarProduto(String produto)
            throws SQLException, Exception {

        String sql = "SELECT * FROM mydb.produto WHERE nome_produto like ?";

        List<Produto> listaProduto = null;

        Connection connection = null;

        PreparedStatement preparedStatement = null;

        ResultSet result = null;
        try {

            connection = ConnectionUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, "%" + produto+ "%");

            result = preparedStatement.executeQuery();

            while (result.next()) {

                if (listaProduto == null) {
                    listaProduto = new ArrayList<Produto>();
                }
                Produto pro= new Produto();
                
                pro.setIdProduto(result.getInt("id_produto"));
                pro.setCodigobarras(result.getString("codigobarras"));
                pro.setNome(result.getString("nome_produto"));
                pro.setDepartamento(result.getString("departamento_produto"));
                pro.setCor(result.getString("cor"));
                pro.setTamanho(result.getString("tamanho_produto"));
                pro.setDescricao(result.getString("descricao_produto"));
                pro.setPreco(result.getString("preco_produto"));
                pro.setQuantidade(result.getString("quant_estoque_produto"));
                pro.setEnable(result.getBoolean("enable_produto"));

                listaProduto.add(pro);
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

        return listaProduto;

    }

    public static Produto obterProduto(Integer id) throws SQLException {

        String sql = "SELECT * FROM produto WHERE (id_produto=? AND enable_produto)";

        Connection connection = null;

        PreparedStatement preparedStatement = null;

        ResultSet result = null;
        try {

            connection = ConnectionUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);

            result = preparedStatement.executeQuery();

            if (result.next()) {

                Produto produto = new Produto();
                
                produto.setIdProduto(result.getInt("id_produto"));
                produto.setCodigobarras(result.getString("codigobarras"));
                produto.setNome(result.getString("nome_produto"));
                produto.setDepartamento(result.getString("departamento_produto"));
                produto.setCor(result.getString("cor"));
                produto.setTamanho(result.getString("tamanho_produto"));
                produto.setDescricao(result.getString("descricao_produto"));
                produto.setPreco(result.getString("preco_produto"));
                produto.setQuantidade(result.getString("quant_estoque_produto"));


                return produto;
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
    public static void atualizarProduto(Produto produto)
            throws SQLException, Exception {

        String sql = "UPDATE mydb.produto SET codigobarras=?, nome_produto=?, departamento_produto=?, cor=?, tamanho_produto=?, descricao_produto=?, preco_produto=?, quant_estoque_produto=? WHERE (id_produto=?)";


        Connection connection = null;

        PreparedStatement preparedStatement = null;
        try {


            connection = ConnectionUtils.getConnection();
             
            preparedStatement = connection.prepareStatement(sql);
            
           
            preparedStatement.setString(1, produto.getCodigobarras());
            preparedStatement.setString(2, produto.getNome());
            preparedStatement.setString(3, produto.getDepartamento());
            preparedStatement.setString(4, produto.getCor());
            preparedStatement.setString(5, produto.getTamanho());
            preparedStatement.setString(6, produto.getDescricao());
            preparedStatement.setString(7, produto.getPreco());
            preparedStatement.setString(8, produto.getQuantidade());
            preparedStatement.setInt(9, produto.getIdProduto());
          

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

    public static void excluirProduto(Integer id) throws SQLException, Exception {
        

       String sql = "DELETE FROM mydb.produto WHERE (id_produto=?)";
   
       Connection connection = null;

        PreparedStatement preparedStatement = null;
        try {

            connection = ConnectionUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);
           

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
