/*
 * Program : Kelipatan11Ganjil.java
 * Pembuat : Marsya Kirana Syahrani
 * Tanggal : 16 Maret 2026
 * Deskripsi : Menampilkan pola
 */
package Praktikum16032026;

/**
 *
 * @author USER
 */
public class PolaSoal8 {
    public static void main(String[] args){
        
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                
                if (i == 1 || i == 5 || i == j){
                    System.out.print(" 0 ");
                }else {
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
    }
}
