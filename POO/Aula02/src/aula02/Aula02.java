/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author Felipe
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CRIANDO UMA NOVA INSTANCIA (OBJETO) DE CANETA
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        c1.modelo = "Zebra Zeb-Roller DX5";
        c1.cor = "Vermelha";
        c1.ponta = 0.5f;
        c1.carga = 50;
        
        c1.destampar();
//        c1.status();
        c1.rabiscar();
        
        c2.tampar();
        c2.rabiscar();
        
    }
    
}
