/*
 * Program : InputVariabel.java
 * Pembuat : Marsya Kirana Syahrani
 * Tanggal : 27 feb 2026
 * Deskripsi : input nilai beberapa buah variabel dengan tipe data berbeda
 */
package Praktikum27022026;

/**
 *
 * @author LAB-SI-PC
 */
import java.util.Scanner;
public class inputvariabel {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String huruf, nama;
        int umur;
        float angka;
        
        System.out.print("Masukkan sebuah bilangan huruf : ");
        huruf = in.nextLine();
        
        System.out.print("Masukkan sebuah bilangan pecahan : ");
        angka = in.nextFloat();
        System.out.println("angka = " + angka);
        in.nextLine();
        
        System.out.print("Masukkan nama Anda : ");
        nama = in.nextLine();
        
        System.out.print("Masukkan umur Anda : ");
        umur = in.nextInt();
    }
}
