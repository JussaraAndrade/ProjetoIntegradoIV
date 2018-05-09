/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model.produto;

import java.sql.Date;

/**
 *
 * @author Jussara Andrade
 */
public class Produto {
     private Integer idProduto;
    private String nomeProduto;
    private String generoProduto;
    private String corProduto;
    private String tamanhoProduto;
    private String descricaoProduto;
    private String precoProduto;
    private Integer qtdEstoqueProduto;
    private Date dataCadastroProduto;

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getGeneroProduto() {
        return generoProduto;
    }

    public void setGeneroProduto(String generoProduto) {
        this.generoProduto = generoProduto;
    }

    public String getCorProduto() {
        return corProduto;
    }

    public void setCorProduto(String corProduto) {
        this.corProduto = corProduto;
    }

    public String getTamanhoProduto() {
        return tamanhoProduto;
    }

    public void setTamanhoProduto(String tamanhoProduto) {
        this.tamanhoProduto = tamanhoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(String precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Integer getQtdEstoqueProduto() {
        return qtdEstoqueProduto;
    }

    public void setQtdEstoqueProduto(Integer qtdEstoqueProduto) {
        this.qtdEstoqueProduto = qtdEstoqueProduto;
    }

    public Date getDataCadastroProduto() {
        return dataCadastroProduto;
    }

    public void setDataCadastroProduto(Date dataCadastroProduto) {
        this.dataCadastroProduto = dataCadastroProduto;
    }
    
    
}


