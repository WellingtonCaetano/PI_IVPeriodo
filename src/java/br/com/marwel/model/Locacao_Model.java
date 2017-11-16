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
public class Locacao_Model {
    //Atributos
    private int numero;
    private Date dt_emissao;
    private Cliente_Model cliente;
    private Veiculo_Model veiculo;
    private String modeloVeiculo;
    private float valorDiaria;
    private Date data_Retirada;
    private Date data_Devolucao;
    private float totalDiarias;
    private float FranquiaDoSeguro;
    private float chequeCalcao;
    
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

    public Cliente_Model getCliente() {
        return cliente;
    }

    public void setCliente(Cliente_Model cliente) {
        this.cliente = cliente;
    }

    public Veiculo_Model getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo_Model veiculo) {
        this.veiculo = veiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Date getData_Retirada() {
        return data_Retirada;
    }

    public void setData_Retirada(Date data_Retirada) {
        this.data_Retirada = data_Retirada;
    }

    public Date getData_Devolucao() {
        return data_Devolucao;
    }

    public void setData_Devolucao(Date data_Devolucao) {
        this.data_Devolucao = data_Devolucao;
    }

    public float getTotalDiarias() {
        return totalDiarias;
    }

    public void setTotalDiarias(float totalDiarias) {
        this.totalDiarias = totalDiarias;
    }

    public float getFranquiaDoSeguro() {
        return FranquiaDoSeguro;
    }

    public void setFranquiaDoSeguro(float FranquiaDoSeguro) {
        this.FranquiaDoSeguro = FranquiaDoSeguro;
    }

    public float getChequeCalcao() {
        return chequeCalcao;
    }

    public void setChequeCalcao(float chequeCalcao) {
        this.chequeCalcao = chequeCalcao;
    }
    
   
}
