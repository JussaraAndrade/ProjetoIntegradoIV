/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model.clientes;
//Atenção: Verificar importação correta caso ocorra algum erro  
//No campo dataVenda
import java.util.Date;

/**
 *
 * @author Jussara Andrade
 */
public class Venda {
    private Integer id;
    private Date data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
   