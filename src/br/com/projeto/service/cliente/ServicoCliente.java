/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.service.cliente;

import br.com.projeto.db.dao.DaoCliente;
import br.com.projeto.exceptions.ClienteException;
import br.com.projeto.exceptions.DataSourceException;
import br.com.projeto.model.clientes.Cliente;
import br.com.projeto.model.produto.Produto;
import br.com.projeto.model.validador.ValidadorProduto;



/**
 *
 * @author Jussara Andrade
 */
public class ServicoCliente {
     private static final ServicoCliente INSTANCE = new ServicoCliente();

    private ServicoCliente() {
        
    }
    
    public static ServicoCliente getInstance() {
        return INSTANCE;
    }
    
    //Insere um cliente na fonte de dados
    public void cadastrarCliente(Cliente cliente)
            throws ClienteException, DataSourceException {
         Produto produto = null;

        //Chama o validador para verificar o cliente
       // ValidadorCliente.validar(cliente);
       ValidadorProduto.produto(produto);

        try {
            //Realiza a chamada de inserção na fonte de dados
            DaoCliente.inserir(cliente);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
}
