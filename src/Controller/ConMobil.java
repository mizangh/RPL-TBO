/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mobil;
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
public class ConMobil {

    private ArrayList<Mobil> listMobil;
    private Connection koneksi;

    public ConMobil() {
        listMobil = new ArrayList<>();
        koneksi = Koneksi.getKoneksi();
    }

    public void addMobil(String jenisMobil, String plat, int harga) {
        Mobil mobil = new Mobil(jenisMobil, plat, harga);
        listMobil.add(mobil);
    }

    public void editMobil(String jenisMobil, int harga) {
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

    public ArrayList<Mobil> getList() {
        return listMobil;
    }

    public void insertMobilSQL(Mobil m) {
        PreparedStatement Statement = null;
        try {
            Statement = koneksi.prepareStatement("insert into mobil (plat, jenisMobil, harga,Status) values (?,?,?,?)");
            Statement.setString(1, m.getPlat());
            Statement.setString(2, m.getJenisMobil());
            Statement.setInt(3, m.getHarga());
            Statement.setBoolean(4, m.getStatus());
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

    public void updateMobilSQL(Mobil m) {
        PreparedStatement Statement = null;
        try {
            Statement = koneksi.prepareStatement("update mobil set jenisMobil=?, harga=?, Status=? where plat=? ");
            Statement.setString(1, m.getJenisMobil());
            Statement.setInt(2, m.getHarga());
            Statement.setBoolean(3, true);
            Statement.setString(4, m.getPlat());
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

    public void deleteMobilSQL(String plat) {
        PreparedStatement Statement = null;
        try {
            Statement = koneksi.prepareStatement("delete from mobil where plat=? ;");
            Statement.setString(1, plat);
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
