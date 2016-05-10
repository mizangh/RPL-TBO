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

    private String noKtp;
    private String namaPemesan;
    private String noHP;

    public Pemesan() {

    }

    public Pemesan(String id_pemesan, String namaPemesan, String noTelpPemesan) {
        this.noKtp = id_pemesan;
        this.namaPemesan = namaPemesan;
        this.noHP = noTelpPemesan;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String id_pemesan) {
        this.noKtp = id_pemesan;
    }

    public String getNoTelpPemesan() {
        return noHP;
    }

    public void setNoTelpPemesan(String noTelpPemesan) {
        this.noHP = noTelpPemesan;
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

}
