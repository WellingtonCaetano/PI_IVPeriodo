package br.com.marwel.model;

/**
 *
 * @author wellington
 */
public class Cidade_Model {
    //Atributos
    private int codigo=0;
    private String nome;
    private Estado_Model estado = new Estado_Model();
    
    //To String

    @Override
    public String toString() {
        return "Cidade_Model{" + "codigo=" + codigo + ", nome=" + nome + ", estado=" + estado + '}';
    }
    
    //Geters e Seters
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

    public Estado_Model getEstado() {
        return estado;
    }

    public void setEstado(Estado_Model estado) {
        this.estado = estado;
    }   
    
}
