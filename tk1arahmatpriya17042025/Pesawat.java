/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk1arahmatpriya17042025;

/**
 *
 * @author Aspire Lite 14
 */
public class Pesawat extends Udara {
    private int muatan;
    
    public Pesawat(){
        
    }
    public Pesawat(String nama, int tahunProduksi, boolean mesin, int muatan){
        super(nama, tahunProduksi, mesin);
        this.muatan = muatan;
    }
    public int getMuatan(){
        return muatan;
    }
    public void setMuatan(int muatan){
        this.muatan = muatan;
    }
    public void Reset(String nama, int tahunProduksi, boolean mesin, int muatan){
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }
    public String kategori(int muatan){
        if(muatan<=50)
            return "Bobot Kecil";
        else if(muatan<=100)
            return "Bobot Menengah";
        else
            return "Bobot Besar";
    }
    public void Cetak(){
        super.Cetak();
        System.out.println("Muatan Pesawat "+muatan+" Orang Penumpang");
        System.out.println("Kategori = "+kategori(muatan));
    }
}
