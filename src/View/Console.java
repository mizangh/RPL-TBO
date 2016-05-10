/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConMobil;
import Model.Mobil;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nikho Sagala
 */
public class Console {

    public static void main(String[] args) {
        //Mobil Tes
        ConMobil cM = new ConMobil();
        Mobil m = new Mobil("Innova", "D1234HD", 120000);
        cM.updateStatMobil("D1234HD");
    }
}
