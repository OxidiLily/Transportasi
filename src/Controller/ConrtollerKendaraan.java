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
public class ConrtollerKendaraan {
    DataForm frame;
    KendaraanInterface interfaceK;
    List<ModelKendaraan> kendaraan;        

    public ConrtollerKendaraan(DataForm frame, KendaraanInterface interfaceK, List<ModelKendaraan> lmk) {
        this.frame = frame;
        interfaceK = new DAOKendaraan();
        kendaraan = interfaceK.getAll();
    }
    
    public void reset(){
        frame.getUser().setText("");
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
    
    public void DataTable(int row){
        frame.getUser().setText(String.valueOf(kendaraan.get(row).getId_User()));
        frame.getTujuanTxt().setText(kendaraan.get(row).getTujuan());
        frame.getNamaTxt().setText(kendaraan.get(row).getNama_pemilik());
    }
    public void isiKotak(int row){
        frame.getUser().setText(String.valueOf(kendaraan.get(row).getId_User()));
        frame.getNamaTxt().setText(kendaraan.get(row).getNama_pemilik());
        frame.getKendaraanTxt().setText(kendaraan.get(row).getNama_kendaraan());
        frame.getMerkTxt().setText(kendaraan.get(row).getNama_merk());
        frame.getTujuanTxt().setText(kendaraan.get(row).getTujuan());
        frame.getKecepatanTxt().setText(String.valueOf(kendaraan.get(row).getKecepatan()));
        frame.getWaktuTxt().setText(String.valueOf(kendaraan.get(row).getWaktu()));
        frame.getJarakTxt().setText(String.valueOf(kendaraan.get(row).getJarak()));
    }
    public void insert(){
        if (!frame.getKecepatanTxt().getText().isEmpty()&& !frame.getWaktuTxt().getText().isEmpty()&& !frame.getNamaTxt().getText().isEmpty()
            && !frame.getKendaraanTxt().getText().isEmpty() && !frame.getMerkTxt().getText().isEmpty() && !frame.getTujuanTxt().getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Periksa Data yang anda input");
        }else{
            double kecepatan = Double.valueOf(frame.getKecepatanTxt().getText().trim());
            double waktu = Double.valueOf(frame.getWaktuTxt().getText().trim());

            double hasil = kecepatan*waktu;
            frame.getJarakTxt().setText(""+hasil);

        }    
    }
    public void delete(){
        
    }
}

   

