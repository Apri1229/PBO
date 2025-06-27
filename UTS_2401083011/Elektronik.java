/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_2401083011;

/**
 *
 * @author Aspire Lite 14
 */
public class Elektronik {
    private int tahunProduksi;
    private int garansi;
    private String merek;

    public Elektronik() {
        
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }
    public void settahunProduksi(int tahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }

    public int getGaransi() {
        return garansi;
    }
    public void setgaransi(int garansi){
        this.garansi = garansi;
    }

    public String getMerek() {
        return merek;
    }
    public void setmerek(String merek){
        this.merek = merek;
    }

}