/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.Koneksi;
import Model.Mobil;
import Model.Supir;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

    /*
    public void addSupir(String namaSupir, double hargaSupir) {
        Supir supir = new Supir(generateID(), namaSupir, hargaSupir);
        listSupir.add(supir);
    }
     */
 /*  public void editSupir(int idSupir, double hargaSupir) {
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
     */
    public ArrayList<Supir> getSupir() {
        return listSupir;
    }

    public void insertSupirSQL(Supir s) {
        PreparedStatement Statement = null;
        try {
            Statement = koneksi.prepareStatement("insert into supir (noTelp, namaSupir, hargaSupir, status) values (?,?,?,?)");
            Statement.setString(1, s.getNoTelp());
            Statement.setString(2, s.getNamaSupir());
            Statement.setDouble(3, s.getHargaSupir());
            Statement.setBoolean(4, false);
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
    
    public void updateStatMobilkembali(int plat) {
        PreparedStatement Statement = null;
        try {
            Statement = koneksi.prepareStatement("update supir set status=? where idSupir=? ");
            Statement.setBoolean(1, false);
            Statement.setInt(2, plat);
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
            Statement = koneksi.prepareStatement("update supir set noTelp=?, namaSupir=?, hargaSupir=?, status=? where idSupir=? ");
            Statement.setString(1, s.getNoTelp());
            Statement.setString(2, s.getNamaSupir());
            Statement.setDouble(3, s.getHargaSupir());
            Statement.setBoolean(4, s.getStatus());
            Statement.setInt(5, s.getIdSupir());
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
            Statement = koneksi.prepareStatement("delete from supir where idSupir=? ;");
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
    
    public void updateStatSupir(int idSupir) {
        PreparedStatement Statement = null;
        try {
            Statement = koneksi.prepareStatement("update supir set Status=? where idSupir=? ");
            Statement.setBoolean(1, true);
            Statement.setInt(2, idSupir);
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
    
    public List<Supir> getSupirSQL() {
        List<Supir> lm = null;
        try {
            lm = new ArrayList<Supir>();
            PreparedStatement Statement = koneksi.prepareStatement("select * from supir where status=0");
            ResultSet rs = Statement.executeQuery();
            while (rs.next()) {
                Supir m = new Supir();
                m.setIdSupir(rs.getInt("idSupir"));
                m.setNamaSupir(rs.getString("namaSupir"));
                m.setNoTelp(rs.getString("noTelp"));
                m.setHargaSupir(rs.getInt("hargaSupir"));
                lm.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConMobil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lm;

    }
    
    public List<Supir> getSupirSQLbyID(int idSupir) {
        List<Supir> lm = null;
        try {
            lm = new ArrayList<Supir>();
            PreparedStatement Statement = koneksi.prepareStatement("select * from supir where idSupir=?");
            Statement.setInt(1, idSupir);
            ResultSet rs = Statement.executeQuery();
            while (rs.next()) {
                Supir m = new Supir();
                m.setIdSupir(rs.getInt("idSupir"));
                m.setNamaSupir(rs.getString("namaSupir"));
                m.setNoTelp(rs.getString("noTelp"));
                m.setHargaSupir(rs.getInt("hargaSupir"));
                lm.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConMobil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lm;

    }

}
