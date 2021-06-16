/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionDB;
import DAOInterface.KendaraanInterface;
import Model.ModelKendaraan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author My MSI
 */
public class DAOKendaraan implements KendaraanInterface{

    Connection connection;
    final String insert = "INSERT INTO kendaraan ( nama_pemilik, nama_kendaraan, nama_merk, Tujuan, kecepatan, waktu , jarak) VALUES(?,?,?,?,?,?,?)";
    final String update = "UPDATE kendaraan SET  nama_pemilik=?, nama_kendaraan=?, nama_merk=?, Tujuan=?, kecepatan=?, waktu=? , jarak=? WHERE id_User=?";
    final String delete = "DELETE FROM kendaraan WHERE id_User=?";
    final String select = "SELECT * FROM kendaraan ";
    final String cari   = "SELECT * FROM kendaraan WHERE id_User LIKE ?";
    private int id_User;

    public DAOKendaraan() {
        connection = ConnectionDB.connection();
    }
    
    
    
    
    @Override
    public void insert(ModelKendaraan tambah) {
      PreparedStatement stat = null;
        try {
            stat = connection.prepareStatement(insert);
            stat.setString(1,tambah.getNama_pemilik());
            stat.setString(2,tambah.getNama_kendaraan());
            stat.setString(3,tambah.getNama_merk());
            stat.setString(4,tambah.getTujuan());
            stat.setInt(5,tambah.getKecepatan());
            stat.setInt(6,tambah.getWaktu());
            stat.setInt(7,tambah.getJarak());
            stat.executeUpdate();
            ResultSet rs = stat.getGeneratedKeys();
            while(rs.next()){
                tambah.setId_User(rs.getInt(1));
            }    
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            try{
                stat.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int hapus) {
        PreparedStatement stat = null;
        try {
            stat = connection.prepareStatement(delete);
            stat.setInt(1, id_User);
            stat.executeUpdate();
            
        } catch (SQLException ex) {
             ex.printStackTrace();
        }finally{
            try{
                stat.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    @Override
    public void update(ModelKendaraan ubah) {
       PreparedStatement stat = null;
        try {
            stat = connection.prepareStatement(update);
            stat.setString(1,ubah.getNama_pemilik());
            stat.setString(2,ubah.getNama_kendaraan());
            stat.setString(3,ubah.getNama_merk());
            stat.setString(4,ubah.getTujuan());
            stat.setInt(5,ubah.getKecepatan());
            stat.setInt(6,ubah.getWaktu());
            stat.setInt(7,ubah.getJarak());
            stat.executeUpdate();
            ResultSet rs = stat.getGeneratedKeys();
            while(rs.next()){
                ubah.setId_User(rs.getInt(1));
            }    
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            try{
                stat.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    @Override
    public List<ModelKendaraan> getAll() {
        List<ModelKendaraan> kendaraan =null;
        
        try {
            kendaraan = new ArrayList<ModelKendaraan>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                ModelKendaraan md = new ModelKendaraan();
                md.setId_User(rs.getInt("id_User"));
                md.setNama_pemilik(rs.getString("nama_pemilik"));
                md.setNama_kendaraan(rs.getString("nama_kendaraan"));
                md.setNama_merk(rs.getString("nama_merk"));
                md.setTujuan(rs.getString("Tujuan"));
                md.setKecepatan(rs.getInt("kecepatan"));
                md.setWaktu(rs.getInt("waktu"));
                md.setJarak(rs.getInt("jarak"));
                
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
        return kendaraan;
        
    }

    @Override
    public List<ModelKendaraan> getCari(Integer id_User) {
        List<ModelKendaraan> kendaraan=null;
        try{
            kendaraan = new ArrayList<ModelKendaraan>();
            PreparedStatement stat = connection.prepareStatement(select);
            stat.setString(1,"%"+id_User+"%");
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                ModelKendaraan md = new ModelKendaraan();
                md.setId_User(rs.getInt("id_User"));
                md.setNama_pemilik(rs.getString("nama_pemilik"));
                md.setNama_kendaraan(rs.getString("nama_kendaraan"));
                md.setNama_merk(rs.getString("nama_merk"));
                md.setTujuan(rs.getString("Tujuan"));
                md.setKecepatan(rs.getInt("kecepatan"));
                md.setWaktu(rs.getInt("waktu"));
                md.setJarak(rs.getInt("jarak"));
                kendaraan.add(md);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return kendaraan;
    }

    
    
}
