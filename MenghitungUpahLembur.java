/*
 * Program : Kelipatan11Ganjil.java
 * Pembuat : Marsya Kirana Syahrani
 * Tanggal : 16 Maret 2026
 * Deskripsi : menghitung total upah lembur karyawan perusahaan
 */
package Praktikum16032026;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class MenghitungUpahLembur {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan jumlah jam lembur: ");
        
        int jam = input.nextInt();
        if (jam > 50){
            jam = 50;
        }
        int upah;
        if (jam <= 20){
            upah = jam * 2000;
        }else {
            upah = jam * 3000;
        }
        System.out.println("Total upah lembur: Rp " + upah);
    }

}
