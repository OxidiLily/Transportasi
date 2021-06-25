/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author My MSI
 */
public class ModelTabelKendaraan extends AbstractTableModel {
    
    List<ModelKendaraan> kendaraan;

    public ModelTabelKendaraan(List<ModelKendaraan> kendaraan) {
        this.kendaraan = kendaraan;
    }
    
    @Override
    public int getRowCount() {
        return kendaraan.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return kendaraan.get(row).getId_User();
            case 1:
                return kendaraan.get(row).getNama_pemilik();
            case 2:
                return kendaraan.get(row).getNama_kendaraan();
            case 3:
                return kendaraan.get(row).getNama_merk();
            case 4:
                return kendaraan.get(row).getTujuan();
            case 5:
                return kendaraan.get(row).getKecepatan();
            case 6:
                return kendaraan.get(row).getWaktu();
            case 7:
                return kendaraan.get(row).getJarak();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0:
                return "ID User";
            case 1:
                return "Nama Pemilik";
            case 2:
                return "Nama Kendaraan";
            case 3:
                return "Nama Merk";
            case 4:
                return "Tujuan";
            case 5:
                return "Kecepatan (KM/Jam)";
            case 6:
                return "Waktu (Jam)";
            case 7:
                return "Jarak (KM)";
            default:
                return null;
        }
    } 
}
