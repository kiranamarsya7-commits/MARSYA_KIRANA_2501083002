/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum06042026;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class MainPersegiPanjangEnkapsulasi {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // INPUT PERSEGI PANJANG 1 
        System.out.println("=== Input Persegi Panjang 1 ===");
        System.out.print("Masukkan panjang : ");
        int p1 = input.nextInt();
        
        System.out.print("Masukkan lebar   : ");
        int l1 = input.nextInt();
        
        // objek dengan konstruktor parameter
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi(p1, l1);
        
        // tampilkan hasil
        System.out.println("\n=== Data Persegi Panjang 1 ===");
        System.out.println("Panjang  : " + pp1.getPanjang());
        System.out.println("Lebar    : " + pp1.getLebar());
        System.out.println("Luas     : " + pp1.getLuas());
        System.out.println("Keliling : " + pp1.getKeliling());
        System.out.println();
        
        // INPUT PERSEGI PANJANG 2
        System.out.println("=== Input Persegi Panjang 2 ===");
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi();
      
        System.out.print("Masukkan panjang : ");
        pp2.setPanjang(input.nextInt());
        
        System.out.print("Masukkan lebar   : ");
        pp2.setLebar(input.nextInt());
        
        // tampilkan hasil
        System.out.println("\n=== Data Persegi Panjang 2 ===");
        System.out.println("Panjang  : " + pp2.getPanjang());
        System.out.println("Lebar    : " + pp2.getLebar());
        System.out.println("Luas     : " + pp2.getLuas());
        System.out.println("Keliling : " + pp2.getKeliling());
        
        // tampilkan jumlah objek
        System.out.println("\nJumlah objek yang dibuat : " + PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        input.close();
    }
}
