/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mobil;
import java.util.ArrayList;

/**
 *
 * @author Nikho Sagala
 */
public class ConMobil extends Mobil {

    private ArrayList<Mobil> listMobil;

    public ConMobil() {
        listMobil = new ArrayList<>();
    }

    public void addMobil(String jenisMobil, String plat, double harga) {
        Mobil mobil = new Mobil(jenisMobil, plat, harga);
        listMobil.add(mobil);
    }

    public void editMobil(String jenisMobil, double harga) {
        for (int i = 0; i < listMobil.size(); i++) {
            if (listMobil.get(i).getJenisMobil().equals(jenisMobil)) {
                listMobil.get(i).setHarga(harga);
            }
        }
    }

    public void deleteMobil(String plat) {
        for (int i = 0; i < listMobil.size(); i++) {
            if (listMobil.get(i).getPlat().equals(plat)) {
                listMobil.remove(i);
            }
        }
    }

    public Mobil getMobil(String jenisMobil) {
        for (int i = 0; i < listMobil.size(); i++) {
            if (listMobil.get(i).getJenisMobil().equals(jenisMobil)) {
                return listMobil.get(i);
            }
        }
        return null;
    }
    
    public ArrayList<Mobil> getList(){
        return listMobil;
    }
}
