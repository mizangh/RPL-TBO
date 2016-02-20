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

    public Supir() {
    }

    public Supir(String idSupir, String namaSupir, double hargaSupir) {
        this.idSupir = idSupir;
        this.namaSupir = namaSupir;
        this.hargaSupir = hargaSupir;
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
    
}
