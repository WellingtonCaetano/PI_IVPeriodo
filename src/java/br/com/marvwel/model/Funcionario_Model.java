/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marvwel.model;

import java.util.Date;

/**
 *
 * @author wellington
 */
public class Funcionario_Model {
    //Atributos
    private int matricula;
    private String nome;
    private String cpf;
    private Date dt_nascimento;
    private Profissao_Model profissao;
    private String telefone;
    private String email;
    private String cep;
    private String endereco;
    private String bairro;
    private Cidade_Model cidade;
    private Estado_Model estado;
    private String senha;
    private boolean status;
    
    //To String
       @Override
    public String toString() {
        return "Funcionario_Model{" + "matricula=" + matricula + ", nome=" + nome + ", cpf=" + cpf + ", dt_nascimento=" + dt_nascimento + ", profissao=" + profissao + ", telefone=" + telefone + ", email=" + email + ", cep=" + cep + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", senha=" + senha + ", status=" + status + '}';
    }
    
    //Getters e Setters
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    public Profissao_Model getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao_Model profissao) {
        this.profissao = profissao;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
}
