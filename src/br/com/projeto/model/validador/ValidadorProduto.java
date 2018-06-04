/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model.validador;


import br.com.projeto.exceptions.ClienteException;
import br.com.projeto.model.produto.Produto;

        


/**
 *
 * @author Jussara Andrade
 */
public class ValidadorProduto {
      public static  void validar(Produto produto) throws ClienteException {
        
             if (produto == null) {
            throw new ClienteException("Não foi informado um produto");
        }
        if (produto.getNome()== null || "".equals(produto.getNome())) {
           throw new ClienteException("É necessário informar "
                  + "o nome do produto");
       }
         if (produto.getDepartamento().trim().equals("Selecione...") ) {
            throw new ClienteException("É necessário informar o "
                    + "departamento do cliente");
        }
         if (produto.getTamanho().trim().equals("Tamanho...") ) {
            throw new ClienteException("É necessário informar o "
                    + "tamanho do cliente");
        } 
        if (produto.getCor().trim().equals("Cor...") ) {
            throw new ClienteException("É necessário informar o "
                    + "cor do cliente");
       }
           if (produto.getPreco().equals("")) {
           throw new ClienteException("É necessário informar "
                    + "o preço do produto");
        }
         
        if (produto.getCodigo() == 0) {
            throw new ClienteException("É necessário informar "
                    + "o código de barra do produto");
        }
        
        
            if (produto.getQuantidade().equals("")) {
            throw new ClienteException("É necessário informar a "
                    + "quantidade do produto");
        } 
        
           
         if (produto.getDescricao().equals("")) {
            throw new ClienteException("É necessário informar a "
                    + "descrição do produto");
        } 
      }  
}
