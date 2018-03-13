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
public class Aluno extends Pessoa {
    // ATRIBUTOS:
    private int matricula;
    private String curso;
    
    // MÉTODOS ESPECIAIS:
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    // MÉTODOS:
    public void pagarMensalidade() {
        System.out.println("Mensalidade de " + this.getNome() + " paga.");
    }
}
