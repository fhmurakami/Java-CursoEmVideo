/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // SAÍDA DE DADOS:
        
//        String nome = "Felipe";
//        float nota = 8.5f;
//        System.out.print("A nota é " + nota);
//        System.out.println("A nota é " + nota); // Imprime e pula uma linha
//        System.out.printf("A nota de %s é %.2f ", nome, nota); // Imprime de forma formatada (nota com 2 casas decimais, %.2f)
//        System.out.format("A nota de %s é %.2f \n", nome, nota);
        
        // ENTRADA DE DADOS:
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f \n", nome, nota);
        
        
        
    }
    
}
