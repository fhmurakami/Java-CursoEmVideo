/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Felipe
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DateFormat relogioFormatado = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogioFormatado.format(relogio));
    }
    
}
