/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author Felipe
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        m.emitirSom();  // Som de mamífero
        l.emitirSom();  // Auuuuuuuuuu
        c.emitirSom();  // Au! Au! Au!
        
        c.reagir("biscoito");   // Abanar
        c.reagir("Vai deitar!");    // Rosnar
        c.reagir(10);   // Abanar
        c.reagir(21);   // Ignorar
        c.reagir(true); // Abanar
        c.reagir(false);    // Rosnar e Latir
        c.reagir(2, 12.5f); // Latir
        c.reagir(10, 4.5f); // Rosnar
        
    }
    
}
