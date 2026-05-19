/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas180526;
import java.util.Scanner;
/**
 *
 * @author LAB_P1_PC02
 */
public class mainKaryawan {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Karyawan kar = null;
        
        System.out.println("===Sistem Penggajian Karyawan===");
        System.out.print("masukkan nama = ");
        String nama = in.nextLine();
        
        System.out.print("masukkan jenis karyawan = \n 1. Tetap \n 2. Kontrak \n pilih: ");
        int jenis = in.nextInt();
        in.nextLine();
        
        switch (jenis){
            case 1: 
                System.out.print("Masukkan gaji= ");
                double gaji = in.nextDouble();
                double tunjangan = gaji*0.025;
                double total = gaji+tunjangan;
                kar = new karyawanTetap(gaji,tunjangan,total,nama,jenis);
                break;
            case 2:
                System.out.print("masukkan jumlah jam kerja dalam sehari= ");
                double jam = in.nextDouble();
                System.out.print("masukkan gaji perjam= ");
                double gajiK = in.nextDouble();
                double totalK = 20* (gajiK*jam);
                
                
                kar = new karyawanKontrak(gajiK,totalK,jam,nama,jenis);
        }
        System.out.println("----- informasi karyawan -----");
        kar.Karyawan();
    }
    
}
