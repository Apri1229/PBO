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
public class Smartphone {
    private int kapasitasBaterai;
    private int jumlahKamera;
    
    public Smartphone(int kapasitasBaterai, int jumlahKamera){
        this.kapasitasBaterai = kapasitasBaterai;
        this.jumlahKamera = jumlahKamera;
    }
    public int getkapsaitasBaterai(){
        return kapasitasBaterai;
    }
    public void setkapasitasBaterai(int kapasitasBaterai){
        this.kapasitasBaterai = kapasitasBaterai;
    }
    public int getjumlahKamera(){
        return jumlahKamera;
    }
    public void setjumlahKamera(int jumlahKamera){
        this.jumlahKamera = jumlahKamera;
    }
    
}
