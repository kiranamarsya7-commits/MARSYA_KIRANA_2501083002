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
public class MainElekronik {

    
    public static void main(String[] args) {
        Gaming g = new Gaming();
        
        g.setMerek("ASUS");
        g.setTahunProduksi(2025);
        g.setGaransi(2);
        
        g.setUkuranLayar(15);
        g.setKapasitasRAM(16);
        
        g.setKartuGrafis("RTX 4060");
        g.setRefreshRate(144);
        
        System.out.println("=== DATA LAPTOP GAMING ===");
        
        System.out.println("Merek :" + g.getMerek());
        System.out.println("Tahun Produksi :" + g.getTahunProduksi());
        System.out.println("Garansi :" + g.getGaransi() + "Tahun");
        System.out.println("Ukuran Layar :" + g.getUkuranLayar() + "Inch");
        System.out.println("RAM :" + g.getKapasitasRAM()+ "GB");
        System.out.println("Kartu Grafis :" + g.getKartuGrafis());
        System.out.println("Refresh Rate :" + g.getRefreshRate() + "Hz");
    }
    
}
