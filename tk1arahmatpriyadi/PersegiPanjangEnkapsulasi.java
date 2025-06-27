/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk1arahmatpriyadi;

/**
 *
 * @author Aspire Lite 14
 */
public class PersegiPanjangEnkapsulasi {
      public int panjang;
    public int lebar;
    public static int JumlahObjek=0;
    
    public PersegiPanjangEnkapsulasi(){
        JumlahObjek++;
    }
    public PersegiPanjangEnkapsulasi(int panjangBaru, int lebarBaru){
        this.panjang=panjangBaru;
        this.lebar=lebarBaru;
        JumlahObjek++;
    }
    public static int getJumlahObjek(){
        return JumlahObjek;
    }
    public int getLuas(){
        return(panjang*lebar);
    }
    public int getKeliling(){
        return 2*(panjang+lebar);
    }
}
