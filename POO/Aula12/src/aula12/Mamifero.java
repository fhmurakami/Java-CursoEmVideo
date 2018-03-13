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
public class Mamifero extends Animal {
    // ATRIBUTOS:
    private String corPelo;
    
    // MÉTODOS ESPECIAIS:

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
    // SOBREPOSIÇÃO DE MÉTODOS:
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero.");
    }
}
