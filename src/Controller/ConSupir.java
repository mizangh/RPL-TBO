/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mobil;
import Model.Supir;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nikho Sagala
 */
public class ConSupir {

    private ArrayList<Supir> listSupir;
    private Connection koneksi;

    public ConSupir() {
        listSupir = new ArrayList<>();
        koneksi = Koneksi.getKoneksi();
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
    
    public void insertSupirlSQL(Supir s) {
        PreparedStatement Statement = null;
        try {
            Statement = koneksi.prepareStatement("insert into supir (idSupir, namaSupir, hargaSupir, status) values (?,?,?,?)");
            Statement.setString(1, s.getIdSupir());
            Statement.setString(2, s.getNamaSupir());
            Statement.setDouble(3, s.getHargaSupir());
            Statement.setBoolean(4, s.getStatus());
            Statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (Statement != null) {
                try {
                    Statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConMobil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void updateSupirSQL(Supir s) {
        PreparedStatement Statement = null;
        try {
            Statement = koneksi.prepareStatement("update super set namaSupir=?, hargaSupir=?, status=? where idSupir=? ");
            Statement.setString(1, s.getNamaSupir());
            Statement.setDouble(2, s.getHargaSupir());
            Statement.setBoolean(3, true);
            Statement.setString(4, s.getIdSupir());
            Statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (Statement != null) {
                try {
                    Statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConMobil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void deleteSupirSQL(String idSupir) {
        PreparedStatement Statement = null;
        try {
            Statement = koneksi.prepareStatement("delete from mobil where idSupir=? ;");
            Statement.setString(1, idSupir);
            Statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (Statement != null) {
                try {

                    Statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConMobil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    

}
