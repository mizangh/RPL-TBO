/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConMobil;
import Controller.ConSupir;
import Model.Mobil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<Mobil> lm = cM.getMobilSQL("Innova");
        for (int i = 0; i < lm.size(); i++) {
                System.out.println(lm.get(i));
                
        }
    }
}

