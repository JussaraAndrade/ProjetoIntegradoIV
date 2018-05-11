/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.servico.cliente;



/**
 *
 * @author Jussara Andrade
 */

import br.com.projeto.db.dao.DaoCliente;
import br.com.projeto.exceptions.ClienteException;
import br.com.projeto.exceptions.DataSourceException;
import br.com.projeto.model.clientes.ClienteCadastro;
import br.com.projeto.model.validador.ValidadorCliente;

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
    public void cadastrarCliente(ClienteCadastro clienteCadastro)
            throws ClienteException, DataSourceException {

        //Chama o validador para verificar o cliente
        ValidadorCliente.validar(clienteCadastro);

        try {
            //Realiza a chamada de inserção na fonte de dados
            DaoCliente.inserir(clienteCadastro);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
}

