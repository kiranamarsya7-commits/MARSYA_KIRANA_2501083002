/*
 * Program : PerulanganDoWhile.java
 * Pembuat : Marsya Kirana Syahrani
 * Tanggal : 09 Maret 2026
 * Deskripsi : program yang user mengintputkan angka secara berulang dan proses input terhenti saat user mengetikkan angka 0
 */
package Praktikum09032026;

/**
 *
 * @author LAB-SI-PC
 */
import java.util.Scanner;

public class PerulanganDoWhile {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         
         int angka;
         int jumlahInput = 0;
         
         do{
             System.out.print("Masukkan angka :");
             angka = input.nextInt();
             
             if (angka > 0){
                 jumlahInput++;
             }
         }while (angka > 0);
         System.out.println("Jumlah angka yang diinputkan :" + jumlahInput);
     }
    
}
