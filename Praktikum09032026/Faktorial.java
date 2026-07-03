/*
 * Program : Faktorial.java
 * Pembuat : Marsya Kirana Syahrani
 * Tanggal : 09 Maret 2026
 * Deskripsi : input nilai faktorial dari angka yanng diinputkan user.
 */
package Praktikum09032026;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int angka;
        int hasil = 1;
        
        System.out.print("Masukkan angka :");
        angka = input.nextInt();
        
        for(int i=1; i<=angka; i++){
            hasil = hasil * i;
        }
        System.out.println(" Nilai faktorial dari "+ angka + " adalah " + hasil);
    }
    
}
