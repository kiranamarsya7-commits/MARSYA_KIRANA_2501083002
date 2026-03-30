
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
public class MainKelasMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        KelasMahasiswa pp1 = new KelasMahasiswa();
        
            System.out.print("Nama = ");
            String n = in.nextLine();
            System.out.print("NIM = ");
            String ni = in.nextLine();
            
            System.out.println("Masukkan Nilai");
            System.out.print("Tugas = ");
            pp1.tugas = in.nextInt();
            System.out.print("Uts = ");
            pp1.uts = in.nextInt();
            System.out.print("Uas = ");
            pp1.uas = in.nextInt();
            
            int nilai = pp1.hitungNilaiAkhir();
            System.out.println("nilai akhir = "+nilai);
    
        
    }
}
