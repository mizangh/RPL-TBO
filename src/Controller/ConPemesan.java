/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Mobil;
import Model.Pemesan;
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
 * @author Mizancuk
 */
public class ConPemesan {

    private Pemesan pemesan;
    private Connection koneksi;

    public ConPemesan() {
        pemesan = new Pemesan();
        koneksi = Koneksi.getKoneksi();
    }

    public void insertPemesanSQL(Pemesan p, String plat) {
        PreparedStatement Statement = null;
        try {
            Statement = koneksi.prepareStatement("insert into pemesan (noKtp,plat,namaPemesan,noTelpPemesan) values (?,?,?,?)");
            Statement.setString(1, p.getNoKtp());
            Statement.setString(2, plat);
            Statement.setString(3, p.getNamaPemesan());
            Statement.setString(4, p.getNoTelpPemesan());
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

    public void updatePemesanSQL(Pemesan p) {
        PreparedStatement Statement = null;
        try {
            Statement = koneksi.prepareStatement("update pemesan set namaPemesan=?, noTelpPemesan=? where id_pemesan=? ");
            Statement.setString(1, p.getNamaPemesan());
            Statement.setString(2, p.getNoTelpPemesan());
            Statement.setString(3, p.getNoKtp());
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

    public void deletePemesanSQL(String id_pemesan) {
        PreparedStatement Statement = null;
        try {
            Statement = koneksi.prepareStatement("delete from pemesan where id_pemesan=? ;");
            Statement.setString(1, id_pemesan);
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
    
    public List<Pemesan> getPemesanan(String plat) {
        List<Pemesan> lm = null;
        try {
            lm = new ArrayList<Pemesan>();
            PreparedStatement Statement = koneksi.prepareStatement("select * from mobil where plat=?");
            Statement.setString(1, plat);
            ResultSet rs = Statement.executeQuery();
            while (rs.next()) {
                Pemesan m = new Pemesan();
                m.setNamaPemesan(rs.getString("namaPemesan"));
                m.setNoKtp(rs.getString("noKtp"));
                m.setNoTelpPemesan(rs.getString("noTelpPemesan"));
                lm.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConMobil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lm;

    }

}
