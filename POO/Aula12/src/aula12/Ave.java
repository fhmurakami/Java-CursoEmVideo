/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author Felipe
 */
public class Ave extends Animal {
    // ATRIBUTOS:
    private String corPena;
    
    // MÉTODOS ESPECIAIS:

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    // SOBREPOSIÇAO DE MÉTODOS ABSTRATOS:

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
    //  MÉTODOS ESPECIALIZADOS:
    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }
}
