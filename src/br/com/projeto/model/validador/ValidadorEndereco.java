/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model.validador;

import br.com.projeto.exceptions.ClienteException;
import br.com.projeto.model.clientes.Endereco;


//import br.com.projeto.model.clientes.Endereco;

/**
 *
 * @author Jussara Andrade
 */
public class ValidadorEndereco {
     public static  void validar(Endereco endereco) throws ClienteException {
        //Realização de validações de negócio
        if (endereco == null) {
            throw new ClienteException("Não foi informado o endereço do cliente");
        }
        if (endereco.getRua()== null || "".equals(endereco.getRua())) {
           throw new ClienteException("É necessário informar "
                    + "o endereço");
        }
        if (endereco.getNumero()== null
                || "".equals(endereco.getNumero())) {
            throw new ClienteException("É necessário informar "
                    + "o número residencial");
        
        }
        if (endereco.getComplemento()== null) {
            throw new ClienteException("É necessário informar "
                    + "o complemento");
        }    
        if (endereco.getBairro()== null) {
            throw new ClienteException("É necessário informar "
                    + "o bairro");    
        
        }
        if (endereco.getUf()== null) {
            throw new ClienteException("É necessário informar "
                    + "o estado");
        }    
        if (endereco.getCidade()== null) {
            throw new ClienteException("É necessário informar "
                    + "a cidade");
        
        }
        if (endereco.getCep().trim().length() != 9) {
            throw new ClienteException("É necessário informar "
                    + "o cep");
        
        }
         
     }
}
      
       
    

    

