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
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // DECLARAÇÃO DOS OBJETOS:
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        // ATRIBUIÇÕES AOS OBJETOS:
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        
        p2.setSexo('F');
        p3.setIdade(47);
        
        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        // ATRIBUIÇÕES QUE NÃO FUNCIONAM, POIS TENTAM UTILIZAR MÉTODOS QUE NÃO SÃO DA CLASSE MÃE:
//        p1.receberAumento(550.20f);
//        p2.mudarTrabalho();
//        p4.cancelaMatr();
        
        p3.fazerAniver();

        // MOSTRAR STATUS DOS OBJETOS:
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
