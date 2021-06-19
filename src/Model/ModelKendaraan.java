/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author My MSI
 */
public class ModelKendaraan {
    private Integer id_User;
    private String nama_pemilik;
    private String nama_kendaraan;
    private String nama_merk;
    private String tujuan;
    private Integer kecepatan;
    private Integer waktu;
    private Integer jarak;

    public Integer getId_User() {
        return id_User;
    }

    public void setId_User(Integer id_User) {
        this.id_User = id_User;
    }

    public String getNama_pemilik() {
        return nama_pemilik;
    }

    public void setNama_pemilik(String nama_pemilik) {
        this.nama_pemilik = nama_pemilik;
    }

    public String getNama_kendaraan() {
        return nama_kendaraan;
    }

    public void setNama_kendaraan(String nama_kendaraan) {
        this.nama_kendaraan = nama_kendaraan;
    }

    public String getNama_merk() {
        return nama_merk;
    }

    public void setNama_merk(String nama_merk) {
        this.nama_merk = nama_merk;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String Tujuan) {
        this.tujuan = Tujuan;
    }

    public Integer getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(Integer kecepatan) {
        this.kecepatan = kecepatan;
    }

    public Integer getWaktu() {
        return waktu;
    }

    public void setWaktu(Integer waktu) {
        this.waktu = waktu;
    }

    public Integer getJarak() {
        return jarak;
    }

    public void setJarak(Integer jarak) {
        this.jarak = jarak;
    }
}
