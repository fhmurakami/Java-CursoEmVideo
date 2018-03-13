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
        
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        
        // Não é possível atribuir valor a ponta pois é um atributo privado
        // c1.ponta = 0.5f; 
        
        // É possivel alterar o valor da variável, pois está dentro da classe 
        // 'Aula02' que utiliza a classe 'Caneta'
        c1.carga = 80;
        
        // Atributo 'tampada' alterado para privado:
        // c1.tampada = true;
        
        c1.status();
        // c1.destampar(); // Método destampar é privado
        // Após alterar os métodos tampa e destampar para públicos.
        c1.destampar();
        
    }
    
}
