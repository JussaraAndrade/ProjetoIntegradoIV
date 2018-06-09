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

    public static void inserir(Produto produto)
            throws SQLException, Exception {

        String sql = "INSERT INTO produto (codigobarras, nome_produto, departamento_produto, cor, tamanho_produto, descricao_produto, preco_produto, quant_estoque_produto, data_cadastro_produto, enable_produto) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ";

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

    public static List<Produto> procurarProduto(String nome)
            throws SQLException, Exception {

        String sql = "SELECT * FROM mydb.produto WHERE nome_produto like ?";

        List<Produto> listaProduto = null;

        Connection connection = null;

        PreparedStatement preparedStatement = null;

        ResultSet result = null;
        try {

            connection = ConnectionUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, "%" + nome + "%");

            result = preparedStatement.executeQuery();

            while (result.next()) {

                if (listaProduto == null) {
                    listaProduto = new ArrayList<Produto>();
                }
                Produto produto = new Produto();

                produto.setCodigobarras(result.getString("codigobarras"));
                produto.setNome(result.getString("nome_produto"));
                produto.setDepartamento(result.getString("departamento_produto"));
                produto.setCor(result.getString("cor"));
                produto.setTamanho(result.getString("tamanho_produto"));
                produto.setDescricao(result.getString("descricao_produto"));
                produto.setPreco(result.getString("preco_produto"));
                produto.setQuantidade(result.getString("quant_estoque_produto"));
                produto.setEnable(result.getBoolean("enable_produto"));

                listaProduto.add(produto);
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

        String sql = "SELECT * FROM mydb.produto WHERE (id_produto=?)";

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

                Produto produto = new Produto();
                produto.setCodigobarras(result.getString("codigobarras"));
                produto.setNome(result.getString("nome_produto"));
                produto.setDepartamento(result.getString("departamento_produto"));
                produto.setCor(result.getString("cor"));
                produto.setTamanho(result.getString("tamanho_produto"));
                produto.setDescricao(result.getString("descricao_produto"));
                produto.setPreco(result.getString("preco_produto"));
                produto.setQuantidade(result.getString("quant_estoque_produto"));
                produto.setEnable(result.getBoolean("enable_produto"));

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

}
