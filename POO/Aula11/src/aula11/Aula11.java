/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author Felipe
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("José");
        v1.setIdade(22);
        v1.setSexo('M');
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Carlos");
        a1.setMatricula(1234);
        a1.setCurso("Informática");
        a1.setIdade(25);
        a1.setSexo('M');
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Paula");
        b1.setMatricula(4321);
        b1.setCurso("Informática");
        b1.setIdade(20);
        b1.setSexo('F');
        b1.pagarMensalidade();
        
        Tecnico t1 = new Tecnico();
        t1.praticar();
        
        Professor p1 = new Professor();
        p1.setSalario(9500.55f);
    }
    
}
