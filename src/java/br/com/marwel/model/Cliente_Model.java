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
public class Cliente_Model {
    //Atributos
    private int codigo;
    private String nome;
    private String cpf;
    private Date dt_nascimento;
    private String cnh;
    private String telefone;
    private String email;
    private String cep;
    private String endereco;
    private String bairro;
    private Cidade_Model cidade;
    private Estado_Model estado;
    private boolean status;
    
    //To String
    @Override
    public String toString() {
        return "Cliente_Model{" + "codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", dt_nascimento=" + dt_nascimento + ", cnh=" + cnh + ", telefone=" + telefone + ", email=" + email + ", cep=" + cep + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", status=" + status + '}';
    }
    
    //Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Cidade_Model getCidade() {
        return cidade;
    }

    public void setCidade(Cidade_Model cidade) {
        this.cidade = cidade;
    }

    public Estado_Model getEstado() {
        return estado;
    }

    public void setEstado(Estado_Model estado) {
        this.estado = estado;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
