/*
 * Program : Kelipatan11Ganjil.java
 * Pembuat : Marsya Kirana Syahrani
 * Tanggal : 16 Maret 2026
 * Deskripsi : Program menampilkan deret kelipatan 11 dan ganjil dengan batas awal dan akhir
 */
package Praktikum16032026;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Kelipatan11Ganjil {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int awal = input.nextInt();
        
        System.out.print("Masukkan batas akhir: ");
        int akhir = input.nextInt();
        
        int jumlah = 0;
        int total = 0;
        
        for(int i = awal; i <= akhir; i++){
        
         if(i % 11 == 0 && i % 2 != 0){
            System.out.print(i + " ");
            total = total + i;
            jumlah++;
        }
      }
        
      double rata = (double) total / jumlah;
      System.out.println("\nJumlah deret: " + total);
      System.out.println("Rata-rata: " + rata);
    }
    
}
