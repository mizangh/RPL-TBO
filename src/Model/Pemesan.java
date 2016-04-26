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
    private int id_pemesan;
    private String namaPemesan;
    private int noTelpPemesan;
    
    public Pemesan(){
    
    }
    public Pemesan(int id_pemesan, String namaPemesan, int noTelpPemesan) {
        this.id_pemesan = id_pemesan;
        this.namaPemesan = namaPemesan;
        this.noTelpPemesan = noTelpPemesan;
    }

    public int getId_pemesan() {
        return id_pemesan;
    }

    public void setId_pemesan(int id_pemesan) {
        this.id_pemesan = id_pemesan;
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
