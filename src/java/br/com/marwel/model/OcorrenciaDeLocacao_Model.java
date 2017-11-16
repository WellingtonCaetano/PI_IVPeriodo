/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marwel.model;

import java.util.Date;

/**
 *
 * @author wellington
 */
public class OcorrenciaDeLocacao_Model {
    //Atributos
    private int numero;
    private Date dt_emissao;
    private Ocorrencia_Model ocorrencia;
    private String descricaoDaOcorrencia;
    private Locacao_Model locacao;
    private float valorOcorrencia;
            
    //Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDt_emissao() {
        return dt_emissao;
    }

    public void setDt_emissao(Date dt_emissao) {
        this.dt_emissao = dt_emissao;
    }

    public Ocorrencia_Model getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(Ocorrencia_Model ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public String getDescricaoDaOcorrencia() {
        return descricaoDaOcorrencia;
    }

    public void setDescricaoDaOcorrencia(String descricaoDaOcorrencia) {
        this.descricaoDaOcorrencia = descricaoDaOcorrencia;
    }

    public Locacao_Model getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao_Model locacao) {
        this.locacao = locacao;
    }

    public float getValorOcorrencia() {
        return valorOcorrencia;
    }

    public void setValorOcorrencia(float valorOcorrencia) {
        this.valorOcorrencia = valorOcorrencia;
    }    
}
