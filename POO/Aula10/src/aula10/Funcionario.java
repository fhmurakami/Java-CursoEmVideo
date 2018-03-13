/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author Felipe
 */
public class Funcionario extends Pessoa {
    // ATRIBUTOS:
    private String setor;
    private boolean trabalhando;
    
    // MÉTODOS ESPECIAIS:
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    // MÉTODOS:
    public void mudarTrabalho() {
        if (this.isTrabalhando()) {
            this.setTrabalhando(false);
        } else {
            this.setTrabalhando(true);
        }
    }
}
