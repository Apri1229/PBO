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
public class MainHewan {
    public static void main(String[] args){
        Hewan hewanku=new Hewan("Makhluk hidup");
        Kucing kucingku=new Kucing("boby");
        anjing anjingku=new Anjing("Helly");
    }
    System.out.println("\nTampilkan akses super class hewan")
    hewanku.tampilkanNama();
    hewanku.bersuara();
    
    System.out.println("\nTampilkan akses super class hewan")
    kucingku.tampilkanNama();
    kucingku.bersuara();
    
    System.out.println("\nTampilkan akses super class hewan")
    anjingku.tampilkanNama();
    anjingku.bersuara();
}
