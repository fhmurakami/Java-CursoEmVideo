/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14;

/**
 *
 * @author Felipe
 */
public abstract class Pessoa {
    // ATRIBUTOS:
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;
    
    // MÉTODOS ESPECIAIS:
    
    @Override    
    public String toString(){    
        return "Nome = " + nome + ", Idade = " + idade + ", Sexo = " + sexo + ", Experiencia = " + experiencia + ", ";
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {    
        this.experiencia = experiencia;
    }

    // MÉTODO:
    protected void ganharExp() {
        this.setExperiencia(this.getExperiencia() + 5);
    }
}
