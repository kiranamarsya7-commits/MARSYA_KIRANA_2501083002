/*
 * Program : Pola.java
 * Pembuat : Marsya Kirana Syahrani
 * Tanggal : 09 Maret 2026
 * Deskripsi : menampilkan pola dengan input angka user.
 */
package Praktikum09032026;

/**
 *
 * @author LAB-SI-PC
 */
import java.util.Scanner;

public class pola {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka :");
        int n = input.nextInt();
        
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}
