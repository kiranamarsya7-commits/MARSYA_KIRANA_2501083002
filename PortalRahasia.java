/*
 * Program : Kelipatan11Ganjil.java
 * Pembuat : Marsya Kirana Syahrani
 * Tanggal : 16 Maret 2026
 * Deskripsi :Menampilkan nomor misi yang merupakan kelipatan 3 dan juga kelipatan 4
 */
package Praktikum16032026;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class PortalRahasia {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nomor awal: ");
        int awal = input.nextInt();
        
        System.out.print("Maukkan nomor akhir: ");
        int akhir = input.nextInt();
        
        System.out.println("Misi yang membuka portal: ");
        
        for(int i = awal; i <= akhir; i++){
           if (i % 3 == 0 && i % 4 == 0)
           System.out.print(i + " ");
        }
    }
    
}
