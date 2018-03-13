/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

/**
 *
 * @author Felipe
 */
public class Aula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        p[0] = new Pessoa("Felipe", 27, 'M');
        p[1] = new Pessoa("Gabriele", 26, 'F');
        l[0] = new Livro("ABC", "Fulano", 5, p[0]);
        l[1] = new Livro("DEF", "Fulana", 3, p[0]);
        l[2] = new Livro("GHI", "Zucleide", 7, p[1]);
        
        l[0].abrir();
        l[0].folhear();
        System.out.println(l[0].detalhes());
    }
    
}
