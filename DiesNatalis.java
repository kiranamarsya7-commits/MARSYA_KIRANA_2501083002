
/*
 * Program : Kelipatan11Ganjil.java
 * Pembuat : Marsya Kirana Syahrani
 * Tanggal : 16 Maret 2026
 * Deskripsi : cek apakah umur PNP kelipatan 10 atau tidak
 */
package Praktikum16032026;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class DiesNatalis {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan umur PNP: ");
        
        int umur = input.nextInt();
        if (umur % 10 == 0){
            int y = umur / 10;
            System.out.println("Dekade PNP ke " + y);
        }else {
            System.out.println("PNP merayakan Dies Natalis ke " + umur);
        }
    }
    
}
