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
public class Peixe extends Animal {
    // ATRIBUTOS:
    private String corEscama;
    
    // MÉTODOS ESPECIAIS:

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    // SOBREPOSIÇÃO DE MÉTODOS ABSTRATOS:

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
    // MÉTOTOS PERSONALIZADOS:
    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }
    
}
