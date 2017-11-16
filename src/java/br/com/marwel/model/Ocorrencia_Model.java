/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marwel.model;

/**
 *
 * @author wellington
 */
public class Ocorrencia_Model {
    //Atributos
    private int codigo;
    private String descricao;
    
    //To String
    @Override
    public String toString() {
        return "Ocorrencia_Model{" + "codigo=" + codigo + ", descricao=" + descricao + '}';
    }
    
    
    //Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
