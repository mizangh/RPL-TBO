/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConMobil;
import java.util.ArrayList;

/**
 *
 * @author Nikho Sagala
 */
public class Console {

    public static void main(String[] args) {
        ConMobil cM = new ConMobil();
        cM.addMobil("Innova", "D 1234 F", 350000);
        cM.addMobil("Xenia", "D 4312 E", 320000);
        cM.addMobil("Alphard", "F 3295 GA", 500000);
        System.out.println(cM.getMobil("Xenia").getHarga());
        cM.editMobil("Xenia", 330000);
        System.out.println(cM.getMobil("Xenia").getHarga());
        //cM.deleteMobil("D 1234 F");
        for (int i = 0; i < cM.getList().size(); i++) {
            System.out.println(cM.getList().get(i).getJenisMobil() + " | " + cM.getList().get(i).getPlat() + " | " + cM.getList().get(i).getHarga());
        }

    }

}
