/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14;

/**
 *
 * @author Felipe
 */
public class Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v = new Video("POO em JAVA");
        Aluno a = new Aluno("Felipe", 27, "M", "fhmrk");
        
        System.out.println(v.toString());
        v.play();
        v.like();
        v.setCurtidas(357);
        v.setViews(400);
        v.setAvaliacao();
        System.out.println(v.toString());
        
        System.out.println(a.toString());
        a.viuMaisUm();
        System.out.println(a.toString());
    }
    
}
