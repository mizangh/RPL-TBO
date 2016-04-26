/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pemesan;
import Model.Supir;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    
    public void insertPemesanSQL(Pemesan p) {
        PreparedStatement Statement = null;
        try {
            Statement = koneksi.prepareStatement("insert into pemesan (namaPemesan, noTelpPemesan) values (?,?)");
            Statement.setString(1, p.getNamaPemesan());
            Statement.setInt(2, p.getNoTelpPemesan());
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
            Statement.setInt(2, p.getNoTelpPemesan());
            Statement.setInt(3, p.getId_pemesan());
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
    
    
}
