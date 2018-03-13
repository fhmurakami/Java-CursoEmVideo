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
public class Professor extends Pessoa {
    // ATRIBUTOS:
    private String especialidade;
    private float salario;
    
    // MÉTODOS ESPECIAIS:
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    // MÉTODOS:
    public void receberAumento(float num) {
        this.setSalario(this.getSalario() + num);
    }
}
