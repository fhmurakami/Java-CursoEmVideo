/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author Felipe
 */
public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Método CONSTRUTOR
    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }

    // Métodos GETTER e SETTER:
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Métodos PERSONALIZADOS:
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
        }
    }

    public void depositar(float v) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + v);
        } else {
            System.out.println("Impossível depositar");
        }
    }

    public void sacar(float v) {
        if (this.isStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal() {
        float v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
        if (this.isStatus()) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível pagar");
        }
    }
    
    public void estadoAtual() {
        String estado;
        estado = (this.isStatus()) ? "Aberta" : "Fechada";
        
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + estado);
    }

}
