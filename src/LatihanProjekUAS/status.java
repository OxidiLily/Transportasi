package LatihanProjekUAS;
/**
 * @author My MSI
 */
public class status  {   
    private String tujuan;
    private int muatan;
    private int jam;
    
    public int getJam() {
        return jam;
    }
    public void setJam(int jam) {
        this.jam = jam;
    }
    public status(String tujuan, int muatan, int jam) {
        setTujuan(tujuan);
        setMuatan(muatan);
        setJam(jam);
    }
    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public int getMuatan() {
        return muatan;
    }

    public void setMuatan(int muatan) {
        this.muatan = muatan;
    }
    public String kategori(int muatan){
        if (muatan <=10){
            return "Mini";
            }
        else if (muatan <=20){
            return "Sedang";
            }
        else{
            return "Besar";
        }     
    }
}