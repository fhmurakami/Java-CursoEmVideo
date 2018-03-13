/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15;

/**
 *
 * @author Felipe
 */
public class Aluno extends Pessoa {
    // ATRIBUTOS:
    private String login;
    private int totAssistido;

    public Aluno(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    // MÉTODOS ESPECIAIS:

    @Override
    public String toString() {
        // super.toString() retorna o método toString() da classe 'Pessoa'
        return "Aluno{" + super.toString() + "Login = " + login + ", Vídeos Assistidos = " + totAssistido + '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    // MÉTODOS:
    public void viuMaisUm() {
        this.totAssistido++;
        this.ganharExp();
    }
}
