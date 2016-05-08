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
public class Pemesan {
    private Mobil m;
    private String noKtp;
    private String namaPemesan;
    private int noTelpPemesan;
    
    public Pemesan(){
    
    }
    public Pemesan(String id_pemesan, String namaPemesan, int noTelpPemesan) {
        m = new Mobil();
        this.noKtp = id_pemesan;
        this.namaPemesan = namaPemesan;
        this.noTelpPemesan = noTelpPemesan;
    }

    public String getPlat(){
        return m.getPlat();
    }
    
    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String id_pemesan) {
        this.noKtp = id_pemesan;
    }

    public int getNoTelpPemesan() {
        return noTelpPemesan;
    }

    public void setNoTelpPemesan(int noTelpPemesan) {
        this.noTelpPemesan = noTelpPemesan;
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }
    
}
