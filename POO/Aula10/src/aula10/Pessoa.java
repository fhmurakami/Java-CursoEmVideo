/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author Felipe
 */
public class Pessoa {
    // ATRIBUTOS:
    private String nome;
    private int idade;
    private char sexo; // M ou F

    // MÉTODOS PERSONALIZADOS:
//    public Pessoa(String nome, int idade, char sexo) {
//        this.nome = nome;
//        this.idade = idade;
//        this.sexo = sexo;
//    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
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
