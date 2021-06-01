package LatihanProjekUAS;
/**
 *
 * @author My MSI
 */
public class mobil extends MencariJarak{
    private String nama;
    private String brand;
    private int tahunproduksi;
    private int jam;
    
    public int getJam() {
        return jam;
    }
    public void setJam(int jam) {
        this.jam = jam;
    }    
    public mobil(String nama, String brand, int tahunproduksi, int waktu, int kecepatan,int jam) {
        super(waktu,kecepatan);
        setNama(nama);
        setBrand(brand);
        setTahunproduksi(tahunproduksi);
        setJam(jam);    
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTahunproduksi() {
        return tahunproduksi;
    }

    public void setTahunproduksi(int tahunproduksi) {
        this.tahunproduksi = tahunproduksi;
    }   
}