/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Nikho Sagala
 */
public class Transaksi {
    private int id_transaksi;
    private Mobil mobil;
    private Pemesan pemesan;
    private Supir supir;
    private Date tanggalPesan;
    private Date tanggalKembali;
    private int Hari;

    public Transaksi(){
    }
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
    
    public String getPlat(){
        return mobil.getJenisMobil();
    }
    
    public String getNoKtp(){
        return pemesan.getNoKtp();
    }
    
    public int getIdSupir(){
        return supir.getIdSupir();
    }
    
    public Date getTanggalPesan() {
        return tanggalPesan;
    }
    
    
    public void setTanggalPesan(Date tanggalPesan) {
        this.tanggalPesan = tanggalPesan;
    }

    public void setDurasi(int Hari){
        this.Hari = Hari;
    }
    public int getDurasi(){
        return Hari;
    }

    public void setTanggalKembali(Date tanggalKembali){
        Calendar cal = Calendar.getInstance();
        cal.setTime(tanggalKembali);
        cal.add(Calendar.DATE, Hari);
        this.tanggalKembali = cal.getTime();
    }   
    public Date getTanggalKembali() {
        return tanggalKembali;
    }
     
}
