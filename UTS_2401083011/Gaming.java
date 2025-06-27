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
public class Gaming {
    private int  refreshRate;
    private String kartuGrafis;
    
    public Gaming (int refreshRate, String kartuGrafis){
        this.refreshRate = refreshRate;
        this.kartuGrafis = kartuGrafis;
    }
    public int getRefreshRate (){
        return refreshRate;
    }
    public void setRefreshRate(int refreshRate){
        this.refreshRate = refreshRate;
    }
    public String getkartuGrafis(){
        return kartuGrafis;
    }
    public void setKartuGrafis(String kartuGrafis){
        this.kartuGrafis = kartuGrafis;
    }
    
}

