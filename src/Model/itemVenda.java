/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Jussara Andrade
 */
public class itemVenda {
    private Integer idItemVendaCliente;
    private Integer itemVendaProduto;
    private String quantidadeProduto;

    public Integer getIdItemVendaCliente() {
        return idItemVendaCliente;
    }

    public void setIdItemVendaCliente(Integer idItemVendaCliente) {
        this.idItemVendaCliente = idItemVendaCliente;
    }

    public Integer getItemVendaProduto() {
        return itemVendaProduto;
    }

    public void setItemVendaProduto(Integer itemVendaProduto) {
        this.itemVendaProduto = itemVendaProduto;
    }

    public String getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(String quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    
    
    
}
