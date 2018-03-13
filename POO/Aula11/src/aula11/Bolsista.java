/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author Felipe
 */
public class Bolsista extends Aluno {
    // ATRIBUTOS
    private float bolsa;
    
    // MÉTODOS ESPECIAIS:

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    // MÉTODOS:
    public void renovarBolsa() {
        System.out.println("Bolsa de " + this.nome + " renovada.");
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista e isent@ de mensalidade.");
    }
        
}
