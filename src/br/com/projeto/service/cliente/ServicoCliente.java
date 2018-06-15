/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.service.cliente;

import br.com.projeto.db.dao.DaoCliente;
import br.com.projeto.db.dao.DaoProduto;
import br.com.projeto.exceptions.ClienteException;
import br.com.projeto.exceptions.DataSourceException;
import br.com.projeto.model.clientes.Cliente;
import br.com.projeto.model.produto.Produto;
import br.com.projeto.model.validador.ValidadorCliente;
import br.com.projeto.model.validador.ValidadorProduto;
import java.util.List;


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
    
    public void cadastrarCliente(Cliente cliente)
            throws ClienteException, DataSourceException {
        

        ValidadorCliente.validar(cliente);
      

        try {
            
            DaoCliente.inserir(cliente);
            
        } catch (Exception e) {
            
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
   
    public void atualizarCliente(Cliente cliente)
            throws ClienteException, DataSourceException {
        
       
        ValidadorCliente.validar(cliente);

        try {
          
            DaoCliente.atualizar(cliente);
            return;
        } catch (Exception e) {
           
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public List<Cliente> procurarCliente(String nome)
            throws ClienteException, DataSourceException {
        try {
         
            if (nome == null || "".equals(nome)) {
                return DaoCliente.listarCliente();
            } else {
                return DaoCliente.procurarCliente(nome);
            }
        } catch (Exception e) {
            
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
     
    public Cliente obterCliente(Integer id)
            throws ClienteException, DataSourceException {
        try {
            return DaoCliente.obterCliente(id);
        } catch (Exception e) {
            
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
      
    public void excluirCliente(Integer id)
            throws ClienteException, DataSourceException {
        try {
           
            DaoCliente.excluir(id);
        } catch (Exception e) {
            
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
    //A parte somente do Produto que está na DAO
     public void cadastrarProduto(Produto produto)
            throws ClienteException, DataSourceException {
        
        ValidadorProduto.validar(produto);

        try {
           
            DaoProduto.inserir(produto);
            
        } catch (Exception e) {
           
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
      public void atualizarProduto(Produto produto)
            throws ClienteException, DataSourceException {
   
           ValidadorProduto.validar(produto);
        try {
           
            DaoProduto.atualizarProduto(produto);
            return;
        } catch (Exception e) {
           
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
        public List<Produto> procurarProduto(String produto)
            throws ClienteException, DataSourceException {
        try {
           
            if (produto == null || "".equals(produto)) {
                return DaoProduto.procurarProduto(produto);
            } else {
                return DaoProduto.procurarProduto(produto);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
      
         public Produto obterProduto(Integer id)
            throws ClienteException, DataSourceException {
        try {
            
            return DaoProduto.obterProduto(id);
        } catch (Exception e) {
           
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
     public void excluirProduto(Integer id)
            throws ClienteException, DataSourceException {
        try {
          
            DaoProduto.excluirProduto(id);
        } catch (Exception e) {
            
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}
