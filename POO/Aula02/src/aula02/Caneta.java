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
public class Caneta {
    
    // ATRIBUTOS:
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    // MÉTODOS:
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }
    
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO");
        } else {
            System.out.println("Rabisco");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

}
