/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConMobil;
import Controller.ConSupir;

/**
 *
 * @author Nikho Sagala
 */
public class Console {

    public static void main(String[] args) {
        //Mobil Tes
        ConMobil cM = new ConMobil();
        cM.addMobil("Innova", "D 1234 F", 550000);
        cM.updateMobilSQL(cM.getMobil("Innova"));
    }
}

