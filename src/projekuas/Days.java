/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekuas;

/**
 *
 * @author My MSI
 */
public class Days {
    private String tgl;
    private String day;
    private int jam;

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }
    public Days(String tgl, String day,int jam) {
        setTgl(tgl);
        setDay(day);
        setJam(jam);
    }
    
    
    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    } 
}
