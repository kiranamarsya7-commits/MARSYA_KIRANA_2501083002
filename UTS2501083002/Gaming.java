/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS2501083002;

/**
 *
 * @author USER
 */
public class Gaming extends Laptop {
    private String kartuGrafis;
    private int refreshRate;
    
    public Gaming(){
        
    }
    
    public String getKartuGrafis(){
        return kartuGrafis;
    }
    
    public void setKartuGrafis(String kartuGrafis){
        this.kartuGrafis = kartuGrafis;
    }
    
    public int getRefreshRate(){
        return refreshRate;
    }
    
    public void setRefreshRate(int refreshRate){
        this.refreshRate = refreshRate;
    }
}
