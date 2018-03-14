/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Felipe
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Date data = new Date();
//        DateFormat anoFormatado = new SimpleDateFormat("Y");
//        String anoAtual = anoFormatado.format(data);
//        int ano = Integer.parseInt(anoAtual);
        
        Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);
        
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun",
            "Jul","Ago","Set","Out","Nov","Dez"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        
        System.out.println("O ano atual é: " + ano);
        if ((ano % 400 == 0) || ((ano % 4 == 0) && !(ano % 100 == 0))){
            tot[1] = 29;
            System.out.println("Ano bissexto.");
        }
        
        for (int c = 0; c < mes.length; c++){
            System.out.println(mes[c] + " tem " + tot[c] + " dias.");
        }
    }
    
}
