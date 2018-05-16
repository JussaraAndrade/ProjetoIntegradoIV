/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.db.dao;

import br.com.projeto.db.utils.ConnectionUtils;
import br.com.projeto.model.clientes.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author Jussara Andrade
 */
public class DaoCliente {
    //Insere um cliente na tabela "cliente" do banco de dados

      
    PreparedStatement pstm;
    
    String ClienteInsert = "INSERT INTO cliente (nome_cliente, sexo_cliente, rg_cliente, cpf_cliente, data_nasc_cliente, email_cliente, celular_cliente, telefone_cliente, data_cadastro_cliente, enable) VALUES (?,?,?,?,?,?,?,?,?,?)";
    
    public void CadastrarCliente(Cliente cliente){
        try{
            ConnectionUtils mysql = new ConnectionUtils();
            pstm= mysql.conectar().prepareStatement(ClienteInsert);
            pstm.setString(1, cliente.getNomeCliente());
            pstm.setString(2, cliente.getSexoCliente());
            pstm.setString(3, cliente.getRgCliente());
            pstm.setString(4, cliente.getCpfCliente());
            pstm.setDate(5, new Date(cliente.getDataNascimentoCliente().getTime()));
            pstm.setString(6, cliente.getEmailCliente());
            pstm.setString(7, cliente.getCelularCliente());
            pstm.setString(8, cliente.getTelefoneCliente());
            pstm.setDate(9, new Date(cliente.getDataCadastroCliente().getTime()));
            pstm.setBoolean(10, true);
            pstm.execute();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
}

       