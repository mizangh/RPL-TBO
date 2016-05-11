/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Connection.FileIO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mizannn
 */
public class App {
    
    private String daftarMobil;
    private FileIO data;

    public App() {
        data = new FileIO();
    }
    
    public void setDaftar(String daftar){
        daftarMobil = daftar;
    }
    
    public String getDaftar(){
        return daftarMobil;
    }
    
    public void saveData() throws IOException {
        try {
            data.saveObject(daftarMobil, "Mobil.txt");
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("File not found.");
        } catch (IOException ex) {
            throw new IOException("IO Exception.");
        }
    }

    @SuppressWarnings("unchecked")
    public void loadData() throws IOException, ClassNotFoundException {
        try {
            daftarMobil = (String) data.getObject("Mobil.txt");
        } catch (ClassNotFoundException ex) {
            throw new ClassNotFoundException("Class not found.");
        } catch (IOException ex) {
            throw new IOException("IO Exception.");
        }
    }

}
