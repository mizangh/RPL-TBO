/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Nikho Sagala
 */
public class Transaksi {
    private Mobil mobil;
    private Pemesan pemesan;
    private Supir supir;
    private Date tanggalPesan;
    private Date tanggalKembali;

    public Transaksi(Mobil mobil, Pemesan pemesan, Date tanggalPesan) {
        this.mobil = mobil;
        this.pemesan = pemesan;
        this.tanggalPesan = tanggalPesan;
    }

    public Transaksi(Mobil mobil, Pemesan pemesan, Supir supir, Date tanggalPesan) {
        this.mobil = mobil;
        this.pemesan = pemesan;
        this.supir = supir;
        this.tanggalPesan = tanggalPesan;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }
     
}
