package LatihanProjekUAS;
/**
 *
 * @author My MSI
 */
import java.util.ArrayList;
public class kendaraan {
   
public static status getArrayDays(ArrayList<status> angka, int jam){
        for (int pkl = 0; pkl <angka.size(); pkl++){
            if (angka.get(pkl).getJam() == jam){
                return angka.get(pkl);
            }
        }
    return null;
    }
public static mobil getArrayMobil(ArrayList<mobil> angka, int jam){
        for (int pkl = 0; pkl <angka.size(); pkl++){
            if (angka.get(pkl).getJam() == jam){
                return angka.get(pkl);
            }
        }
    return null;
    }
public static void main(String[] args) {
    
// Mobil
    ArrayList<mobil>  listTransportasi = new  ArrayList<mobil>();
    listTransportasi.add(new mobil("SX4 S-Cross","Suzuki",2018,37,120,8));
    listTransportasi.add(new mobil("LX460","Lexus",2012,18,115,2));
    listTransportasi.add(new mobil("Civic","Honda",2020,50,90,5));

// Hari
    ArrayList<Days> hari = new ArrayList<Days>();
    hari.add(new Days ("5 Agustus 2019","Senin",5));
    hari.add(new Days ("15 Maret 2019","Jumat",8));
    hari.add(new Days ("4 Mei 2019","Sabtu",2));
   
// Status
    ArrayList<status> stat = new ArrayList<status>();
    stat.add(new status ("Sumatera",15,2));
    stat.add(new status ("Bali",30,5));
    stat.add(new status ("Nusa Tenggara Timur",10,8));
 
    for (int a = 0;a < listTransportasi.size(); a++){
        System.out.println("Kendaraan       ke- : "+(a+1));
        System.out.println("Hari, Tanggal       : "+hari.get(a).getDay()+", "+hari.get(a).getTgl()+" || Pukul : "+stat.get(a).getJam()+" PM");
        System.out.println("Nama  kendaraan     : "+listTransportasi.get(a).getNama());
        System.out.println("Merek               : "+getArrayMobil(listTransportasi,listTransportasi.get(a).getJam()).getBrand());
        System.out.println("Tahun Produksi      : "+getArrayMobil(listTransportasi,listTransportasi.get(a).getJam()).getTahunproduksi());
        System.out.println("Tujuan              : "+getArrayDays(stat,stat.get(a).getJam()).getTujuan());
        System.out.println("Jarak yang ditempuh : "+listTransportasi.get(a).getWaktu()*listTransportasi.get(a).getKecepatan()+" KM");
        System.out.println("Muatan              : "+getArrayDays(stat,stat.get(a).getJam()).kategori(stat.get(a).getMuatan()));
        
        
        System.out.println("");
        }  
    }
}
