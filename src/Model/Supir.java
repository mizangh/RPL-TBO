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

    private String idSupir;
    private String namaSupir;
    private double hargaSupir;
    private boolean status;

    public Supir() {
    }

    public Supir(String idSupir, String namaSupir, double hargaSupir) {
        this.idSupir = idSupir;
        this.namaSupir = namaSupir;
        this.hargaSupir = hargaSupir;
        this.status = false;
    }

    public String getIdSupir() {
        return idSupir;
    }

    public void setIdSupir(String idSupir) {
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
