/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.db.dao;

import br.com.projeto.db.utils.ConnectionUtils;
import br.com.projeto.model.clientes.ClienteCadastro;
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
      //Insere um cliente na tabela "cliente" do banco de dados
    public static void inserir(ClienteCadastro cliente)
            throws SQLException, Exception {
        //Monta a string de inserção de um cliente no BD,
        //utilizando os dados do clientes passados como parâmetro
        String sql = "INSERT INTO cliente ( id_cliente, nome_cliente, "
                + "sexo_cliente, rg_cliente, cpf_cliente, data_nasc_cliente "
                + "email_cliente, celular_cliente, telefone_cliente, data_cadastro_cliente ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
        //Conexão para abertura e fechamento
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
            preparedStatement.setInt(1, cliente.getIdCliente());
            preparedStatement.setString(2, cliente.getNomeCliente());
            Timestamp t = new Timestamp(cliente.getDataNascimentoCliente().getTime());
            preparedStatement.setTimestamp(3, t);
            preparedStatement.setString(4, cliente.getSexoCliente());
            preparedStatement.setInt(5, cliente.getRgCliente());
            preparedStatement.setInt(6, cliente.getCpfCliente());
            preparedStatement.setString(7, cliente.getEmailCliente());
            preparedStatement.setString(8, cliente.getTelefoneCliente());
            preparedStatement.setString(9, cliente.getCelularCliente());
        Timestamp te = new Timestamp(cliente.getDataCadastroCliente().getTime()); 
      

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

    //Realiza a atualização dos dados de um cliente, com ID e dados
    //fornecidos como parâmetro através de um objeto da classe "Cliente"
    public static void atualizar(ClienteCadastro cliente)
            throws SQLException, Exception {
        //Monta a string de atualização do cliente no BD, utilizando
        //prepared statement
        String sql = "UPDATE cliente SET nome_cliente=?, sexo_cliente=?, rg_cliente=?, cpf_cliente=?"
                + "email_cliente, telefone_cliente, celular_cliente, data_nasc_cliente, data_cadastro_cliente"
                + "WHERE (id_cliente=?)";
        
        
        //Conexão para abertura e fechamento
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
          preparedStatement.setInt(1, cliente.getIdCliente());
            preparedStatement.setString(2, cliente.getNomeCliente());
            Timestamp t = new Timestamp(cliente.getDataNascimentoCliente().getTime());
            preparedStatement.setTimestamp(3, t);
            preparedStatement.setString(4, cliente.getSexoCliente());
            preparedStatement.setInt(5, cliente.getRgCliente());
            preparedStatement.setInt(6, cliente.getCpfCliente());
            preparedStatement.setString(7, cliente.getEmailCliente());
            preparedStatement.setString(8, cliente.getTelefoneCliente());
            preparedStatement.setString(9, cliente.getCelularCliente());
        Timestamp te = new Timestamp(cliente.getDataCadastroCliente().getTime()); 
      

            //Executa o comando no banco de dados
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

    //Realiza a exclusão lógica de um cliente no BD, com ID fornecido
    //como parâmetro. A exclusão lógica simplesmente "desliga" o
    //cliente, configurando um atributo específico, a ser ignorado
    //em todas as consultas de cliente ("enabled").
    public static void excluir(Integer id) throws SQLException, Exception {
        //Monta a string de atualização do cliente no BD, utilizando
        //prepared statement
        String sql = "UPDATE cliente SET enabled=? WHERE (id_cliente=?)";
        //Conexão para abertura e fechamento
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
            preparedStatement.setBoolean(1, false);
            preparedStatement.setInt(2, id);

            //Executa o comando no banco de dados
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

    //Lista todos os clientes da tabela clientes
    public static List<ClienteCadastro> listar()
            throws SQLException, Exception {
        //Monta a string de listagem de clientes no banco, considerando
        //apenas a coluna de ativação de clientes ("enabled")
        String sql = "SELECT * FROM cliente WHERE (enabled=?)";
        //Lista de clientes de resultado
        List<ClienteCadastro> listaClientes = null;
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, true);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaClientes == null) {
                    listaClientes = new ArrayList<ClienteCadastro>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD
                ClienteCadastro cliente = new ClienteCadastro();
                cliente.setIdCliente(result.getInt("id_cliente"));
                cliente.setNomeCliente(result.getString("nome_cliente"));      
                cliente.setSexoCliente(result.getString("sexo_cliente"));
                cliente.setRgCliente(result.getInt("rg_cliente"));
                cliente.setCpfCliente(result.getInt("cpf_cliente"));
                cliente.setEmailCliente(result.getString("email_cliente"));
                cliente.setTelefoneCliente(result.getString("telefone_cliente"));
                cliente.setCelularCliente(result.getString("celular_cliente"));
                Date d = new Date(result.getTimestamp("data_nasc_cliente").getTime());
                Date dt = new Date(result.getTimestamp("data_cadastro_cliente").getTime());
                cliente.setDataNascimentoCliente(d);

               
                
                //Adiciona a instância na lista
                listaClientes.add(cliente);
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        //Retorna a lista de clientes do banco de dados
        return listaClientes;
    }

    //Procura um cliente no banco de dados, de acordo com o nome
    //ou com o sobrenome, passado como parâmetro
    public static List<ClienteCadastro> procurar(String valor)
            throws SQLException, Exception {
        //Monta a string de consulta de clientes no banco, utilizando
        //o valor passado como parâmetro para busca nas colunas de
        //nome ou sobrenome (através do "LIKE" e ignorando minúsculas
        //ou maiúsculas, através do "UPPER" aplicado à coluna e ao
        //parâmetro). Além disso, também considera apenas os elementos
        //que possuem a coluna de ativação de clientes configurada com
        //o valor correto ("enabled" com "true")
        String sql = "SELECT * FROM cliente WHERE ((UPPER(nome_cliente) LIKE UPPER(?) "
                + "OR UPPER(cliente.nome_cliente) LIKE UPPER(?)) AND enabled=?)";
        //Lista de clientes de resultado
        List<ClienteCadastro> listaClientes = null;
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setString(1, "%" + valor + "%");
            preparedStatement.setString(2, "%" + valor + "%");
            preparedStatement.setBoolean(3, true);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaClientes == null) {
                    listaClientes = new ArrayList<ClienteCadastro>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD
                ClienteCadastro cliente = new ClienteCadastro();
                cliente.setIdCliente(result.getInt("id_cliente"));
                cliente.setNomeCliente(result.getString("nome_cliente"));      
                cliente.setSexoCliente(result.getString("sexo_cliente"));
                cliente.setRgCliente(result.getInt("rg_cliente"));
                cliente.setCpfCliente(result.getInt("cpf_cliente"));
                cliente.setEmailCliente(result.getString("email_cliente"));
                cliente.setTelefoneCliente(result.getString("telefone_cliente"));
                cliente.setCelularCliente(result.getString("celular_cliente"));
                Date d = new Date(result.getTimestamp("data_nasc_cliente").getTime());
                Date dt = new Date(result.getTimestamp("data_cadastro_cliente").getTime());
                cliente.setDataNascimentoCliente(d);
                
                
                //Adiciona a instância na lista
                listaClientes.add(cliente);
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        //Retorna a lista de clientes do banco de dados
        return listaClientes;
    }

    //Obtém uma instância da classe "Cliente" através de dados do
    //banco de dados, de acordo com o ID fornecido como parâmetro
    public static ClienteCadastro obter(Integer id)
            throws SQLException, Exception {
        //Compõe uma String de consulta que considera apenas o cliente
        //com o ID informado e que esteja ativo ("enabled" com "true")
        String sql = "SELECT * FROM cliente WHERE (id_cliente=? AND enabled=?)";

        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        PreparedStatement preparedStatement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            preparedStatement = connection.prepareStatement(sql);
            //Configura os parâmetros do "PreparedStatement"
            preparedStatement.setInt(1, id);
            preparedStatement.setBoolean(2, true);

            //Executa a consulta SQL no banco de dados
            result = preparedStatement.executeQuery();

            //Verifica se há pelo menos um resultado
            if (result.next()) {
                //Cria uma instância de Cliente e popula com os valores do BD
                ClienteCadastro cliente = new ClienteCadastro();
                cliente.setIdCliente(result.getInt("id_cliente"));
                cliente.setNomeCliente(result.getString("nome_cliente"));      
                cliente.setSexoCliente(result.getString("sexo_cliente"));
                cliente.setRgCliente(result.getInt("rg_cliente"));
                cliente.setCpfCliente(result.getInt("cpf_cliente"));
                cliente.setEmailCliente(result.getString("email_cliente"));
                cliente.setTelefoneCliente(result.getString("telefone_cliente"));
                cliente.setCelularCliente(result.getString("celular_cliente"));
                Date d = new Date(result.getTimestamp("data_nasc_cliente").getTime());
                Date dt = new Date(result.getTimestamp("data_cadastro_cliente").getTime());
                cliente.setDataNascimentoCliente(d);

                //Retorna o resultado
                return cliente;
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }

        //Se chegamos aqui, o "return" anterior não foi executado porque
        //a pesquisa não teve resultados
        //Neste caso, não há um elemento a retornar, então retornamos "null"
        return null;
    }
}

    

