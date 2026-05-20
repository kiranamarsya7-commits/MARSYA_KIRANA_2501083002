/*
 * Program : PersegiPanjang.java
 * Pembuat : Marsya Kiarana Syahrani
 * Tanggal : 30 Maret 2026
 * Deskripsi :
 */
package Praktikum30032026;

/**
 *
 * @author USER
 */
public class PersegiPanjang {
    int panjang; //atribut
    int lebar; // atribut
    
    //konstruktor
    PersegiPanjang(){
        
    }
    
    PersegiPanjang(int a,int b){
        panjang = a;
        lebar = b;
    }
    
    //method
    int hitungLuas(){
        return (panjang*lebar);
    }
    
    int hitungKeliling(){
        return (2 * (panjang*lebar));
    }
}
