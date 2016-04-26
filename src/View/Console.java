/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConMobil;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Nikho Sagala
 */
public class Console {

    public static void main(String[] args) {
        //Mobil Tes
        ConMobil cM = new ConMobil();
        //cM.addMobil("Innova", "D 1234 F", 300000);
        //cM.insertMobilSQL(cM.getMobil("Innova"));
        /*List<Mobil> lm = cM.getMobilSQL("Innova");
        for (int i = 0; i < lm.size(); i++) {
                System.out.println(lm.get(i));
                
        }*/
        Calendar cal = Calendar.getInstance();
        
        Date d = new Date();
        cal.setTime(d);
        cal.add(Calendar.DATE, 2);
        System.out.println(d);
    }
}

