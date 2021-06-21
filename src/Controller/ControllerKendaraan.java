/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOKendaraan;
import DAOInterface.KendaraanInterface;
import Model.ModelKendaraan;
import Model.ModelTabelKendaraan;
import View.DataForm;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author My MSI
 */
public class ControllerKendaraan {
    DataForm frame;
    KendaraanInterface interfaceK;
    List<ModelKendaraan> kendaraan;        

    public ControllerKendaraan(DataForm frame) {
        this.frame = frame;
        interfaceK = new DAOKendaraan();
        kendaraan = interfaceK.getAll();
    }
    
    public void reset(){
        frame.getUserTxt().setText("");
        frame.getNamaTxt().setText("");
        frame.getKendaraanTxt().setText("");
        frame.getMerkTxt().setText("");
        frame.getTujuanTxt().setText("");
        frame.getKecepatanTxt().setText("");
        frame.getWaktuTxt().setText("");
        frame.getJarakTxt().setText("");
    }
    
    public void DataTable(){
        kendaraan = interfaceK.getAll();
        ModelTabelKendaraan mtk = new ModelTabelKendaraan(kendaraan);
        frame.getTableData().setModel(mtk);
    }
    
    public void isiKotak(int row){
        frame.getUserTxt().setText(kendaraan.get(row).getId_User().toString());
        frame.getNamaTxt().setText(kendaraan.get(row).getNama_pemilik());
        frame.getKendaraanTxt().setText(kendaraan.get(row).getNama_kendaraan());
        frame.getMerkTxt().setText(kendaraan.get(row).getNama_merk());
        frame.getTujuanTxt().setText(kendaraan.get(row).getTujuan());
        frame.getKecepatanTxt().setText(String.valueOf(kendaraan.get(row).getKecepatan()));
        frame.getWaktuTxt().setText(String.valueOf(kendaraan.get(row).getWaktu()));
        frame.getJarakTxt().setText(String.valueOf(kendaraan.get(row).getJarak()));
    }
    public void insert(){
        if (!frame.getKecepatanTxt().getText().isEmpty() & !frame.getWaktuTxt().getText().isEmpty()& !frame.getNamaTxt().getText().isEmpty()
            & !frame.getKendaraanTxt().getText().isEmpty() & !frame.getMerkTxt().getText().isEmpty() & !frame.getTujuanTxt().getText().isEmpty()){
             ModelKendaraan tambah = new ModelKendaraan();
            
            tambah.setNama_pemilik(frame.getNamaTxt().getText());
            tambah.setNama_kendaraan(frame.getKendaraanTxt().getText());
            tambah.setTujuan(frame.getTujuanTxt().getText());
            tambah.setNama_merk(frame.getMerkTxt().getText());
            tambah.setKecepatan(Integer.parseInt(frame.getKecepatanTxt().getText()));
            tambah.setWaktu(Integer.parseInt(frame.getWaktuTxt().getText()));
            tambah.setJarak(Integer.parseInt(frame.getJarakTxt().getText()));
            interfaceK.insert(tambah);
            
        }else{
           JOptionPane.showMessageDialog(null, "Periksa Data yang anda input");
        }    
    }
    public void delete(){
        if (!frame.getUserTxt().getText().trim().isEmpty()){
            int id_User = Integer.parseInt(frame.getUserTxt().getText());
            interfaceK.delete(id_User);
            JOptionPane.showMessageDialog(null, "Data di Hapus");
        } else{
            JOptionPane.showMessageDialog(null, "Data gagal di Hapus");
        }
    }
    public void update (){
        if (!frame.getKecepatanTxt().getText().isEmpty() & !frame.getWaktuTxt().getText().isEmpty()& !frame.getNamaTxt().getText().isEmpty()
            & !frame.getKendaraanTxt().getText().isEmpty() & !frame.getMerkTxt().getText().isEmpty() & !frame.getTujuanTxt().getText().isEmpty()){
            
            ModelKendaraan ubah = new ModelKendaraan();
            
            ubah.setNama_pemilik(frame.getNamaTxt().getText());
            ubah.setNama_kendaraan(frame.getKendaraanTxt().getText());
            ubah.setNama_merk(frame.getMerkTxt().getText());
            ubah.setTujuan(frame.getTujuanTxt().getText());
            ubah.setKecepatan(Integer.parseInt(frame.getKecepatanTxt().getText()));
            ubah.setWaktu(Integer.parseInt(frame.getWaktuTxt().getText()));
            ubah.setJarak(Integer.parseInt(frame.getJarakTxt().getText()));
            ubah.setId_User(Integer.parseInt(frame.getUserTxt().getText()));
            interfaceK.update(ubah);
            
            JOptionPane.showMessageDialog(null, "Data di Perbarui");
        } else{
            JOptionPane.showMessageDialog(null, "Data gagal di Perbarui");
        }
    }
    public void isiCari(){
        kendaraan = interfaceK.getCari(Integer.parseInt(frame.getUserTxt().getText()));
        ModelTabelKendaraan mtk = new ModelTabelKendaraan(kendaraan);
        frame.getTableData().setModel(mtk);    
    }
    public void cari(){
        if(!frame.getUserTxt().getText().trim().isEmpty()){
            interfaceK.getCari(Integer.parseInt(frame.getUserTxt().getText()));
            isiCari();
        }else{
            JOptionPane.showMessageDialog(null, "Periksa Data User ID yang anda input");
        }
    
    
    }
}

   

