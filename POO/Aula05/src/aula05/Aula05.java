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
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Cria uma conta nova:
        ContaBanco c1 = new ContaBanco();
        
        c1.estadoAtual();

        // Abre uma conta poupança, configura o nome e numero da conta
        c1.abrirConta("CP");
        c1.setDono("Felipe");
        c1.setNumConta(01);

        c1.estadoAtual();
        
        // Deposita 150 reais
        c1.depositar(150);
        c1.estadoAtual();

        //Saca 300 reais
        c1.sacar(300);
        c1.estadoAtual();
        
        // Tenta pagar mensalidade
        c1.pagarMensal();
        c1.estadoAtual();
        
        // Tenta fechar conta
        c1.fecharConta();
        c1.estadoAtual();
        
        c1.pagarMensal();

    }

}
