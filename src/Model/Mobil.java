/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Nikho Sagala
 */
public class Mobil {

    private String jenisMobil;
    private String plat;
    private int harga;
    private boolean status;

    public Mobil() {
    }

    public Mobil(String jenisMobil, String plat, int harga) {
        this.jenisMobil = jenisMobil;
        this.plat = plat;
        this.harga = harga;
        this.status = false;
    }

    public String getJenisMobil() {
        return jenisMobil;
    }

    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Mobil{" + "jenisMobil=" + jenisMobil + ", plat=" + plat + ", harga=" + harga + ", status=" + status + '}';
    }
    
}
