/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Mizancuk
 */
public class Koneksi {

    private static Connection koneksi;
    
    public static Connection getKoneksi() {
        if (koneksi == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/rental");
            dataSource.setUser("root");
            dataSource.setPassword("");

            try {
                koneksi = dataSource.getConnection();
                System.out.println("sukses");
            } catch (SQLException ex) {
                System.out.println("errror");
            }

        }
        return koneksi;
    }

}
