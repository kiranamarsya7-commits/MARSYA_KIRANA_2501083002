/*
 * Program : Kelipatan11Ganjil.java
 * Pembuat : Marsya Kirana Syahrani
 * Tanggal : 16 Maret 2026
 * Deskripsi : input bilangan genap yang jika diinputksn bil genap akan ditambah 1, jika ganjil akan meminta input sampai input bil genap
 */
package Praktikum16032026;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class InputBilanganGenap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int angka;
        
        do{
            System.out.print("Masukkan bilangan genap: ");
            angka = input.nextInt();
        }while(angka % 2 != 0);
        
        angka = angka + 1;
        System.out.println("Hasil setelah ditambah 1: " + angka);
    }
    
}
