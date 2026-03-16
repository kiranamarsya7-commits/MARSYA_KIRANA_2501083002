/*
 * Program : MenghitungUang.java
 * Pembuat : Marsya Kirana Syahrani
 * Tanggal : 16 Maret 2026
 * Deskripsi : Menghitung berapa uang yang pasti diterima dan uang yang masih bisa di dapatkan
 */
package Praktikum16032026;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class MenghitungUang {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int TotalHalaman = 50;
        int BayarPerHalaman = 15000;
        
        System.out.print("Masukkan jumlah halaman yang sudah diketik: ");
        int X = input.nextInt();
        
        int UangDiterima = X * BayarPerHalaman;
        int SisaHalaman = TotalHalaman - X;
        int UangSisa = SisaHalaman * BayarPerHalaman;
        
        System.out.println("Uang yang sudah diterima Dina: Rp " + UangDiterima);
        System.out.println("Uang yang masih bisa didapat : Rp " + UangSisa);
    }
    
}
