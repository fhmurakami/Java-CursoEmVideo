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
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Animal n = new Animal ();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro d = new Cachorro();
        Cobra k = new Cobra();
        Tartaruga t = new Tartaruga();
        Carpa ca = new Carpa();
        Arara ar = new Arara();
        
        c.locomover();
        d.locomover();
        d.emitirSom();
    }
    
}
