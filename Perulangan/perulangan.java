/*
 * Program : Perulangan.java
 * Pembuat : Marsya Kirana Syahrani
 * Tanggal : 09 Maret 2026
 * Deskripsi : input nilai beberapa buah variabel dengan tipe data berbeda
 */
package Praktikum09032026;

/**
 *
 * @author USER
 */
public class perulangan {
    public static void main(String[] args){
        System.out.println("Perulangan 1-10");
        for(int i=1; i<10; i++)
        {
            System.out.print("\t"+i);
        }
        System.out.println("\nPerulangan 10-1");
        for(int i=10; i>=1; i--)
        {
            System.out.print("\t"+i);
        }
    }
    
}
