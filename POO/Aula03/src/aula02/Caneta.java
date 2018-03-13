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
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    // MÉTODOS:
    
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO");
        } else {
            System.out.println("Rabisco");
        }
    }

    public void tampar() {
        // Apesar de 'tampada' ser um atributo privado, é possível alterar seu 
        // valor desta forma, pois a alteração é realizada dentro da própria
        // classe 'Caneta'
        this.tampada = true;
    }

    public void destampar() {
        // Apesar de 'tampada' ser um atributo privado, é possível alterar seu 
        // valor desta forma, pois a alteração é realizada dentro da própria
        // classe 'Caneta'
        this.tampada = false;
    }

}
