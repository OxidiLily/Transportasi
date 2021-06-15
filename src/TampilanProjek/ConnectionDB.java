/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TampilanProjek;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author My MSI
 */
public class ConnectionDB {
    static final String jdbc_Driver = "com.mysql.jdbc.Driver";
    static final String url="jdbc:mysql://localhost:3306/pbo";
    static final String user ="root";
    static final String pass ="";
    static Connection conn;
    static Statement stat;
    static ResultSet rs;
    
    public static Connection connectDatabase(){
        //try pernyataan memungkinkan untuk menentukan blok kode yang akan diuji untuk kesalahan ketika sedang dijalankan.
        //catch pernyataan memungkinkan untuk menentukan blok kode yang akan dieksekusi, jika terjadi kesalahan dalam blok try.
        try {
            Class.forName(jdbc_Driver); // Class.forName untuk registrasiclass driver dan melakukan intansiasi
        } catch (ClassNotFoundException cnf){
            
        //Apabila driver yang dimaksud tidak ditemukan, maka program akan menghasilkan exception berupa ClassNotFoundException
        
        } try {
            conn = (Connection) DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null,"Koneksi Database berhasil");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi Database gagal");
        } catch(HeadlessException e){
            
        }
            return conn;
    }
}
