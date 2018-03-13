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
public class Tecnico extends Aluno{
    // ATRIBUTOS:
    private int registroProfissional;
    
    // MÉTODOS ESPECIAIS:

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    // MÉTODOS:
    public void praticar() {
        System.out.println("Praticando...");
    }
    
}
