/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15;

/**
 *
 * @author Felipe
 */
public class Aula15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("POO em JAVA");
        v[1] = new Video("Programação em PYTHON");
        v[2] = new Video("Aprenda HTML");
        
        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("Felipe", 27, "M", "fhmrk");
        a[1] = new Aluno("Gabriele", 26, "F", "ggris");
        
        Visualizacao visu[] = new Visualizacao[5];
        visu[0] = new Visualizacao(a[0], v[0]);
        visu[0].avaliar();
        System.out.println(visu[0].toString());
        visu[1] = new Visualizacao(a[0], v[2]);
        visu[1].avaliar(35);
        System.out.println(visu[1].toString());
        
        System.out.println("\nVIDEOS\n----------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nALUNOS\n-----------------------------");
        System.out.println(a[0].toString());
        System.out.println(a[1].toString());
    }
    
}
