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
public class Laptop extends Elektronik{
    private int ukuranLayar;
    private int kapasitasRam;
    
    public Laptop(int ukuranLayar, int kapasitasRam){
        this.kapasitasRam = kapasitasRam;
        this.ukuranLayar = ukuranLayar;
        
    }
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar = ukuranLayar;
    }
    
    public int getKapasitasRam(){
        return kapasitasRam;
    }
    public void setKapasitasRam(int kapasitasRam){
        this.kapasitasRam = kapasitasRam;
    }
    
}
