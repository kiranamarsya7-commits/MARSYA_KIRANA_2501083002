/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum30032026;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class MainPersegiPanjang {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang ();
        pp1.panjang = 20;
        pp1.lebar = 10;
        int luas = pp1.hitungLuas();
        System.out.println("Objek Persegi Panjang Pertama");
        System.out.println("Panjang = "+pp1.panjang);
        System.out.println("Lebar = "+pp1.lebar);
        System.out.println("Luas = "+luas);
        System.out.println("Keliling = "+pp1.hitungKeliling());
        
        //membuat objek kedua menggunakan kontruktor 2
        PersegiPanjang pp2 = new PersegiPanjang (10,5);
        luas = pp2.hitungLuas();
        System.out.println("Objek Persegi Panjang Kedua");
        System.out.println("Panjang = "+pp2.panjang);
        System.out.println("Lebar = "+pp2.lebar);
        System.out.println("Luas = "+luas);
        System.out.println("Keliling = "+pp2.hitungKeliling());
        
        //membuat objek ketiga menggunakan kontruktor 2
        Scanner input = new Scanner(System.in);
        System.out.println("Objek Persegi Panjang Ketiga");
        System.out.print("Panjang = ");
        int pj = input.nextInt();
        System.out.print("Lebar = ");
        int lb = input.nextInt();
        PersegiPanjang pp3 = new PersegiPanjang(pj,lb);
        System.out.println("Luas = "+pp3.hitungLuas());
        System.out.println("Keliling = "+pp3.hitungKeliling());
    }
    
}
