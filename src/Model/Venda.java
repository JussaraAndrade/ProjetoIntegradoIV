/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
//Atenção: Verificar importação correta caso ocorra algum erro  
//No campo dataVenda
import java.util.Date;

/**
 *
 * @author Jussara Andrade
 */
public class Venda {
    private Integer idClienteVenda;
    private Date dataVenda;
    
    public Integer getIdClienteVenda() {
        return idClienteVenda;
    }

    public void setIdClienteVenda(Integer idClienteVenda) {
        this.idClienteVenda = idClienteVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    
    
}
