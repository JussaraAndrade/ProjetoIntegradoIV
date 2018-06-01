package br.com.projeto.model.validador;

import br.com.projeto.exceptions.ClienteException;
import br.com.projeto.model.clientes.Cliente;


/**
 *
 * @author Jussara Andrade
 */
public class ValidadorCliente {
     public static  void validar(Cliente cliente) throws ClienteException {
       
       if (cliente == null) {
            throw new ClienteException("Não foi informado um cliente");
        }
        if (cliente.getNome()== null || "".equals(cliente.getNome())) {
            throw new ClienteException("É necessário informar "
                   + "o nome do cliente");
        }
        if (cliente.getDataNasc()== null ) {
            throw new ClienteException("É necessário informar "
                    + "a data de nascimento do cliente");
        }
         if  (cliente.getTelefone().length() < 12){
            throw new ClienteException("É necessário informar "
                    + "um número de telefone do cliente");
        }
          if (cliente.getCpf().length() < 12) {
            throw new ClienteException("É necessário informar "
                    + "o cpf do cliente");
        }
           if (cliente.getRg().length()< 11) {
            throw new ClienteException("É necessário informar "
                    + "o rg do cliente");
        }
            if (cliente.getCelular().length()< 13) {
            throw new ClienteException("É necessário informar "
                    + "um número de telefone do cliente");
       }
           if (cliente.getSexo()== null ) {
            throw new ClienteException("É necessário informar o "
                    + "gênero do cliente");
           }
       
        if (cliente.getEmail()== null) {
            throw new ClienteException("É necessário informar "
                    + "um e-mail do cliente");
        }
    
    }
}

