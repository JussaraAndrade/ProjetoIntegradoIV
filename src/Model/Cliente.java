/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Jussara Andrade
 */
public class Cliente {
    private Integer idCliente;
    private String nomeCliente;
    private String sexoCliente;
    private Integer rgCliente;
    private Integer cpfCliente;
    private Date dataNascimentoCliente;
    private String emailCliente;
    private String telefoneCliente;
    private String celularCliente;
    private Date dataCadastroCliente;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public Integer getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(Integer rgCliente) {
        this.rgCliente = rgCliente;
    }

    public Integer getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(Integer cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Date getDataNascimentoCliente() {
        return dataNascimentoCliente;
    }

    public void setDataNascimentoCliente(Date dataNascimentoCliente) {
        this.dataNascimentoCliente = dataNascimentoCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public Date getDataCadastroCliente() {
        return dataCadastroCliente;
    }

    public void setDataCadastroCliente(Date dataCadastroCliente) {
        this.dataCadastroCliente = dataCadastroCliente;
    }
    
    
    
    
}
