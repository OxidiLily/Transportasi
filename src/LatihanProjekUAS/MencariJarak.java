/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanProjekUAS;

/**
 *
 * @author My MSI
 */
class MencariJarak {
   private int waktu;
   private int kecepatan;

    public MencariJarak(int waktu, int kecepatan) {
        setWaktu(waktu);
        setKecepatan(kecepatan);
    }
    public int getWaktu() {
        return waktu;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    } 
}
