/*
 * Program : Kelipatan11Ganjil.java
 * Pembuat : Marsya Kirana Syahrani
 * Tanggal : 16 Maret 2026
 * Deskripsi : Menampilkan pola angka bentuk segitiga
 */
package Praktikum16032026;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class PolaAngkaSegitiga {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan ukuran: ");
        int n = input.nextInt();
        
        for (int i = n; i >= 1; i--){
            for (int j = 1; j < i; j++){
                System.out.print("   ");
            }
            for (int x = i; x <= n; x++){
                System.out.print(x + "  ");
            }
            System.out.println();
        }
        
        
    }
    
}
