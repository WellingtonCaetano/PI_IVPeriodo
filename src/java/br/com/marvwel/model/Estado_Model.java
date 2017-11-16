package br.com.marvwel.model;

/**
 *
 * @author wellington
 */
public class Estado_Model {
    //Atributos
    private int codigo;
    private String nome;
    private String sigla;
    
    //To String

    @Override
    public String toString() {
        return "Estado_Model{" + "codigo=" + codigo + ", nome=" + nome + ", sigla=" + sigla + '}';
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    
}
