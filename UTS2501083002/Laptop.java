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
public class Laptop extends Elektronik {
    private int ukuranLayar;
    private int kapasitasRAM;
    
    public Laptop(){
        
    }
    
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar = ukuranLayar;
    }
    
    public int getKapasitasRAM(){
        return kapasitasRAM;
    }
    
    public void setKapasitasRAM(int kapasitasRAM){
        this.kapasitasRAM = kapasitasRAM;
    }
}
