/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marvwel.model;

/**
 *
 * @author wellington
 */
public class PrecoDiariaVeiculo {
    //Atributos
    private int coidgo; 
    private CategoriaVeiculo_Model categoria;
    private boolean acessorios;
    private float valor;
    
    //Getters e Setters
    public int getCoidgo() {
        return coidgo;
    }

    public void setCoidgo(int coidgo) {
        this.coidgo = coidgo;
    }

    public CategoriaVeiculo_Model getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaVeiculo_Model categoria) {
        this.categoria = categoria;
    }

    public boolean isAcessorios() {
        return acessorios;
    }

    public void setAcessorios(boolean acessorios) {
        this.acessorios = acessorios;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
    
}
