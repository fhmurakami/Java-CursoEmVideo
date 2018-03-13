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
public class Canguru extends Mamifero {
    // SOBRESCREVENDO MÉTODO DE MAMÍFERO:
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
    
    // MÉTODO PERSONALIZADO:
    public void usarBolsa() {
        System.out.println("Usando Bolsa");        
    }
    
}
