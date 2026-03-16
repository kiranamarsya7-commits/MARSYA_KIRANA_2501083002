/*
 * Program : DiskonSusu.java
 * Pembuat : Marsya Kirana Syahrani
 * Tanggal : 16 Maret 2026
 * Deskripsi : Menghitung total pembelian, diskon, dan total pembayaran
 */
package Praktikum16032026;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class DiskonSusu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan merek (X/Y/Z): ");
        String merek = input.next();
        System.out.print("Masukkan jumlah kotak: ");
        
        int jumlah = input.nextInt();
        int harga = 0;
        double diskon = 0;
        
        if(merek.equalsIgnoreCase("X")){
            harga = 40000;
            if(jumlah >= 3){
                diskon = 0.10;
            }
        }
        else
            if(merek.equalsIgnoreCase("Y")){
                harga = 50000;
                if(jumlah > 3){
                    diskon = 0.12;
                }
            }
        else
            if (merek.equalsIgnoreCase("Z")){
                harga = 60000;
                if(jumlah >= 2){
                    diskon = 0.15;
                }
            }
        
        int total = harga * jumlah;
        double potongan = total * diskon;
        double bayar = total - potongan;
        
        System.out.println("Total pembelian: Rp " + total);
        System.out.println("Diskon: Rp " + potongan);
        System.out.println("Total bayar: Rp " + bayar);
    }
    
}
