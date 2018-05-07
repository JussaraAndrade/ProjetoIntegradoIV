///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package br.com.projeto.service.clienteCad;
//
//import br.com.projeto.db.dao.DaoCliente;
//import br.com.projeto.exceptions.ClienteException;
//import br.com.projeto.exceptions.DataSourceException;
//import br.com.projeto.model.validador.ValidadorUsuario;
//import br.com.projeto.ui.vendedor.Cliente;
//import java.util.List;
//
///**
// *
// * @author Jussara Andrade
// */
//public class ServicoClienteCad {
//    private static final ServicoClienteCad INSTANCE = new ServicoClienteCad();
//
//    private ServicoClienteCad() {
//        
//    }
//    
//    public static ServicoClienteCad getInstance() {
//        return INSTANCE;
//    }
//    
//    //Insere um cliente na fonte de dados
//    public void cadastrarCliente(Cliente cliente)
//            throws ClienteException, DataSourceException {
//
//        //Chama o validador para verificar o cliente
//        ValidadorUsuario.validar(cliente);
//
//        try {
//            //Realiza a chamada de inserção na fonte de dados
//            DaoCliente.inserir(cliente);
//        } catch (Exception e) {
//            //Imprime qualquer erro técnico no console e devolve
//            //uma exceção e uma mensagem amigável a camada de visão
//            e.printStackTrace();
//            throw new DataSourceException("Erro na fonte de dados", e);
//        }
//    }
//
//    //Atualiza um cliente na fonte de dados
//    public void atualizarCliente(Cliente cliente)
//            throws ClienteException, DataSourceException {
//        
//        //Chama o validador para verificar o cliente
//        ValidadorUsuario.validar(cliente);
//
//        try {
//            //Realiza a chamada de atualização na fonte de dados
//            DaoCliente.atualizar(cliente);
//            return;
//        } catch (Exception e) {
//            //Imprime qualquer erro técnico no console e devolve
//            //uma exceção e uma mensagem amigável a camada de visão
//            e.printStackTrace();
//            throw new DataSourceException("Erro na fonte de dados", e);
//        }
//    }
//
//    //Realiza a pesquisa de um cliente por nome na fonte de dados
//    public List<Cliente> procurarCliente(String nome)
//            throws ClienteException, DataSourceException {
//        try {
//            //Verifica se um parâmetro de pesquisa não foi informado.
//            //Caso afirmativo, realiza uma listagem simples do DAO.
//            //Caso contrário, realiza uma pesquisa com o parâmetro
//            if (nome == null || "".equals(nome)) {
//                return DaoCliente.listar();
//            } else {
//                return DaoCliente.procurar(nome);
//            }
//        } catch (Exception e) {
//            //Imprime qualquer erro técnico no console e devolve
//            //uma exceção e uma mensagem amigável a camada de visão
//            e.printStackTrace();
//            throw new DataSourceException("Erro na fonte de dados", e);
//        }
//    }
//
//    //Obtem o cliente com ID informado
//    public Cliente obterCliente(Integer id)
//            throws ClienteException, DataSourceException {
//        try {
//            //Retorna o cliente obtido com o DAO
//            return DaoCliente.obter(id);
//        } catch (Exception e) {
//            //Imprime qualquer erro técnico no console e devolve
//            //uma exceção e uma mensagem amigável a camada de visão
//            e.printStackTrace();
//            throw new DataSourceException("Erro na fonte de dados", e);
//        }
//    }
//
//    //Exclui o cliente com ID informado
//    public void excluirCliente(Integer id)
//            throws ClienteException, DataSourceException {
//        try {
//            //Solicita ao DAO a exclusão do cliente informado
//            DaoCliente.excluir(id);
//        } catch (Exception e) {
//            //Imprime qualquer erro técnico no console e devolve
//            //uma exceção e uma mensagem amigável a camada de visão
//            e.printStackTrace();
//            throw new DataSourceException("Erro na fonte de dados", e);
//        }
//    }
//    
//}
