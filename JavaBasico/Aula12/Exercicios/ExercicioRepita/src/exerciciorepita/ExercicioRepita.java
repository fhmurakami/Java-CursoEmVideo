/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane; // Importa telas e painéis já prontos

/**
 *
 * @author Felipe
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Mostra uma mensagem
        // (nome_da_janela, "mensagem", "Título", ícone)
        // JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        
        // Entrada de dados
        int n, s = 0, cont = 0, pares = 0, impares = 0, m100 = 0, media = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(0 interrompe)</em></html>"));
            if (n == 0){
                break;
            } else {
                cont++;
                if (n % 2 == 0){
                    pares++;
                } else {
                    impares++;
                }
                if (n > 100){
                    m100++;
                }
                s += n;
            }
        } while (n != 0);
        media = s/cont;
        JOptionPane.showMessageDialog(null, 
                "<html>Resultado: <hr>" + 
                "<br>Total de valores: " + cont +
                "<br>Total de pares: " + pares + 
                "<br>Total de ímpares: " + impares +
                "<br>Acima de 100: " + m100 +
                "<br>Média dos valores: " + media + "</html>");
    }
    
}
