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
        if (cliente.getNome().trim().equals("")){
            throw new ClienteException("É necessário informar "
                   + "o nome do cliente");
        }
        if (cliente.getDataNasc()== null) {
            throw new ClienteException("É necessário informar "
                    + "a data de nascimento do cliente");
        }
       
       if  (cliente.getTelefone().trim().length() < 13){
            throw new ClienteException("É necessário informar "
                    + "um número de telefone do cliente");
            
        }
        
          if (cliente.getCpf().trim().length() < 11) {
            throw new ClienteException("É necessário informar "
                    + "o cpf do cliente");
            
        }
           if (cliente.getRg().trim().length() < 9) {
            throw new ClienteException("É necessário informar "
                    + "o rg do cliente");
        }
            if (cliente.getCelular().trim().length() < 14) {
            throw new ClienteException("É necessário informar "
                    + "o número de celular do cliente");
       }
            if (cliente.getSexo()== null || "Selecione...".equals(cliente.getSexo())) {
            throw new ClienteException("É necessário informar o "
                    + "gênero do cliente");
            }
       
        if (cliente.getEmail().trim().equals("")) {
            throw new ClienteException("É necessário informar "
                    + "um e-mail do cliente");
        }
    
    }
}

