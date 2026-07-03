/*
 * Program : HargaTiketBus.java
 * Pembuat : Marsya Kirana Syahrani
 * Tanggal : 16 Maret 2026
 * Deskripsi :Menghitung harga tiket berdasarkan tujuan, kelas, jumlah dan ada diskon dengan beberapa ketentuan.
 */
package Praktikum16032026;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class HargaTiketBus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tujuan (1=Jakarta, 2=Yogya, 3=Surabaya): ");
        int tujuan = input.nextInt();
        
        System.out.print("Kelas (1=Eksekutif, 2=Bisnis, 3=Ekonomi): ");
        int kelas = input.nextInt();
        
        System.out.print("Jumlah tiket: ");
        int jumlah = input.nextInt();
        
        int harga = 0;
        
        if(tujuan == 1 && kelas == 1)
            harga = 70000;
        if(tujuan == 1 && kelas == 2)
            harga = 40000;
        if(tujuan == 1 && kelas == 3)
            harga = 10000;
        
        if(tujuan == 2 && kelas == 1)
            harga = 80000;
        if(tujuan == 2 && kelas == 2)
            harga = 50000;
        if(tujuan == 2 && kelas == 3)
            harga = 20000;
        
        if(tujuan == 3 && kelas == 1)
            harga = 90000;
        if(tujuan == 3 && kelas == 2)
            harga = 60000;
        if(tujuan == 3 && kelas == 3)
            harga = 30000;
        
        int total = harga * jumlah;
        int diskon = 0;
        
        if (jumlah >= 4 && ((tujuan == 3 && kelas == 1) || (tujuan == 2 && kelas == 3))){
            diskon = total * 10 / 100;
        }
        int totalbayar = total - diskon;
        
        System.out.println("Harga tiket: " + harga);
        System.out.println("Total Harga: " + total);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalbayar);
    }
    
}
