/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author Felipe
 */
public class Caneta {
    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    // Alt + insert = inserir Construtor, Getter e Setter automaticamente.
    
    // Método CONSTRUTOR, possui o mesmo nome da classe, sem 'void':
    public Caneta(String m, String c, float p) {
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }
    
    // Métodos GETTERS:
    public String getModelo() {
        return this.modelo;
    }
    
    public float getPonta() {
        return this.ponta;
    }

    public String getCor() {
        return cor;
    }

    public boolean isTampada() {
        return tampada;
    }
    
    
    
    // Métodos SETTERS:
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public void setPonta(float p) {
        this.ponta = p;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    
    
    // Métodos PERSONALIZADOS:
    public void status() {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
}
