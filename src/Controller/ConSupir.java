/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Supir;
import java.util.ArrayList;

/**
 *
 * @author Nikho Sagala
 */
public class ConSupir {

    private ArrayList<Supir> listSupir;

    public ConSupir() {
        listSupir = new ArrayList<>();
    }

    public String generateID() {
        return "SU" + listSupir.size();
    }

    public void addSupir(String namaSupir, double hargaSupir) {
        Supir supir = new Supir(generateID(), namaSupir, hargaSupir);
        listSupir.add(supir);
    }

    public void editSupir(String idSupir, double hargaSupir) {
        for (int i = 0; i < listSupir.size(); i++) {
            if (listSupir.get(i).getIdSupir().equals(idSupir)) {
                listSupir.get(i).setHargaSupir(hargaSupir);
            }
        }
    }

    public void deleteSupir(String idSupir) {
        for (int i = 0; i < listSupir.size(); i++) {
            if (listSupir.get(i).getIdSupir().equals(idSupir)) {
                listSupir.remove(i);
            }
        }
    }

    public ArrayList<Supir> getSupir() {
        return listSupir;
    }

}
