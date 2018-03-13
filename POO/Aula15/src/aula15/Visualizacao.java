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
public class Visualizacao {
    // ATRIBUTOS:
    private Aluno espectador;
    private Video filme;
    
    // MÉTODOS ESPECIAIS:

    public Visualizacao(Aluno espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
//        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.espectador.viuMaisUm();
        this.filme.setViews(this.filme.getViews() + 1);
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
    public Aluno getEspectador() {
        return espectador;
    }

    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    
    // MÉTODOS:
    public void avaliar() {
        this.filme.setAvaliacao();
    }
    
    public void avaliar(float nota) {
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(int porc) {
        float tot = 0;
        if (porc <= 20) {
            tot = 1.5f;
        } else if (porc <= 50) {
            tot = 2.5f;
        } else if (porc <= 90) {
            tot = 4.0f;
        } else {
            tot = 5.0f;
        }
        this.filme.setAvaliacao(tot);
    }
    
}
