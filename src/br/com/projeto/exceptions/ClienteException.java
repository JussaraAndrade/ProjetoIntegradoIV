/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.exceptions;

/**
 *
 * @author Jussara Andrade
 */

    //Indica uma exceção de cliente
public class ClienteException extends Exception {

    //Construtor de exceções que permite informar uma mensagem  
    public ClienteException(String message) {
        super(message);
    }
    
}
