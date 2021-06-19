/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author My MSI
 */
public class ConnectionDB {
    static Connection con;
    
    
    public static Connection connection(){
        if(con == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setPort(3306);
            data.setDatabaseName("pbo");
            data.setUser("root");
            data.setPassword("");
         
            try{
                con = data.getConnection();
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Koneksi Database gagal");
            }
        }
        return con;
    }
}
