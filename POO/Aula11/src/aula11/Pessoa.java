/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author Felipe
 */
public abstract class Pessoa {
    // ATRIBUTOS:
    protected String nome;
    private int idade;
    private char sexo; // M ou F

    // MÉTODOS PERSONALIZADOS:

    @Override
    public String toString() {
        return "Dados{" + "nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + '}';
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        } else {
            System.out.println("Sexo indefinido");
        }
    }
    
    // MÉTODOS:
    public void fazerAniver() {
        System.out.println("Parabéns!");
        this.idade++;
    }
    
}
