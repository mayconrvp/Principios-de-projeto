package com.ufes.withSRP;

/**
 *
 * @author maycon
 */
class Departamento {
    private String nome;
    private int codigo;

    public Departamento(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        String departamento = "";
        departamento += "Departamento: " + getNome() + "\n";
        departamento += "Código do Departamento" + getCodigo() + "\n";
        
        return departamento;
    }
    
}
