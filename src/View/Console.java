/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ConMobil;
import Model.App;
import Model.Mobil;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nikho Sagala
 */
public class Console {

    public static void main(String[] args) throws IOException{
       App app = new App();
       app.setDaftar("");
       app.saveData();
    }
}
