/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Supir;
import Model.Transaksi;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mizannn
 */
public class ConTransaksi {
    private Connection koneksi;
    private Transaksi transaksi;
    
    public ConTransaksi() {
        koneksi = Koneksi.getKoneksi();
        transaksi = new Transaksi();
    }
    
    public void insertTransaksiSQL(Transaksi t) {
        PreparedStatement Statement = null;
        try {
            Statement = koneksi.prepareStatement("insert into transaksi (plat,noKtp,idSupir,tglPesan,tglKembali,hari) values (?,?,?,?,?,?)");
            Statement.setString(1, t.getPlat());
            Statement.setString(2, t.getNoKtp());
            Statement.setInt(3, t.getIdSupir());
            Statement.setDate(4, (Date) t.getTanggalPesan());
            Statement.setDate(5, (Date) t.getTanggalKembali());
            Statement.setInt(6, t.getDurasi());
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
