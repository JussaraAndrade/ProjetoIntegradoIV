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
public class ClienteEndereço {
    
    private Integer idClienteEndereço;
    private String ruaCliente;
    private String numeroCliente;
    private String bairroCliente;
    private String cidadeCliente;
    private String ufCliente;
    private Integer cepCliente;
    private String complementoCliente;

    public Integer getIdClienteEndereço() {
        return idClienteEndereço;
    }

    public void setIdClienteEndereço(Integer idClienteEndereço) {
        this.idClienteEndereço = idClienteEndereço;
    }

    public String getRuaCliente() {
        return ruaCliente;
    }

    public void setRuaCliente(String ruaCliente) {
        this.ruaCliente = ruaCliente;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getUfCliente() {
        return ufCliente;
    }

    public void setUfCliente(String ufCliente) {
        this.ufCliente = ufCliente;
    }

    public Integer getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(Integer cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getComplementoCliente() {
        return complementoCliente;
    }

    public void setComplementoCliente(String complementoCliente) {
        this.complementoCliente = complementoCliente;
    }
    
    
    
    
}
