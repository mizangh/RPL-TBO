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
public class Supir {

    private int idSupir;
    private String noTelp;
    private String namaSupir;
    private double hargaSupir;
    private boolean status;

    public Supir() {
    }

    public Supir(String namaSupir, double hargaSupir, String noTelp) {
        this.noTelp = noTelp;
        this.namaSupir = namaSupir;
        this.hargaSupir = hargaSupir;
        this.status = false;
    }

    public int getIdSupir() {
        return idSupir;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public void setIdSupir(int idSupir) {
        this.idSupir = idSupir;
    }

    public String getNamaSupir() {
        return namaSupir;
    }

    public void setNamaSupir(String namaSupir) {
        this.namaSupir = namaSupir;
    }

    public double getHargaSupir() {
        return hargaSupir;
    }

    public void setHargaSupir(double hargaSupir) {
        this.hargaSupir = hargaSupir;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }
}
