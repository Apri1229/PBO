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
public class SmartWatch {
    private int ukuranLayar;
    private boolean tahanAir;
    
    public SmartWatch(int ukuranLayar, boolean tahanAir){
        this.ukuranLayar = ukuranLayar;
        this.tahanAir = tahanAir;
    }
    public int getukuranLayar(){
        return ukuranLayar;
    }
    public void setukuranLayar(int ukuranLayar){
        this.ukuranLayar = ukuranLayar;
    }
    public void settahanAir(boolean tahanAir){
        this.tahanAir = tahanAir;
    }
    public boolean gettahanAir(){
        return tahanAir;
    }
}
