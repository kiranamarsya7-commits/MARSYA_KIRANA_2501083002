/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum27042026;

import java.util.Scanner;
/**
 *
 * @author USER
 */
public class MainPesawat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        //Input jumlah data
        System.out.print("Masukkan jumlah data pesawat: ");
        int jumlah = in.nextInt();
        in.nextLine(); // Membersihkan buffer agar input teks selanjutnya tidak terlewat

        //Membuat Array of Object untuk Pesawat
        Pesawat[] daftarPesawat = new Pesawat[jumlah];

        //Loop untuk Input Data
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n--- Input Data Pesawat ke-" + (i + 1) + " ---");
            System.out.print("Nama Pesawat     : ");
            String nama = in.nextLine();
            
            System.out.print("Tahun Produksi   : ");
            int tahun = in.nextInt();
            
            System.out.print("Gunakan Mesin? (true/false) : ");
            boolean mesin = in.nextBoolean();
            
            System.out.print("Jumlah Muatan (Penumpang)   : ");
            int muatan = in.nextInt();
            in.nextLine(); // Membersihkan buffer

            //Memasukkan data ke dalam array
            daftarPesawat[i] = new Pesawat(nama, tahun, mesin, muatan);
        }

        //Menampilkan semua data dan mencari muatan terbanyak
        System.out.println("\n===========================================");
        System.out.println("             DAFTAR DATA PESAWAT           ");
        System.out.println("===========================================");
        
        int maxMuatan = -1;
        String namaPesawatTerbesar = "";

        for (int i = 0; i < daftarPesawat.length; i++) {
            System.out.println("Data Pesawat ke-" + (i + 1) + ":");
            daftarPesawat[i].cetak(); // Memanggil method cetak yang sudah di-override
            System.out.println();

            //Logika mencari nilai muatan tertinggi
            if (daftarPesawat[i].getMuatan() > maxMuatan) {
                maxMuatan = daftarPesawat[i].getMuatan();
                namaPesawatTerbesar = daftarPesawat[i].getNama();
            }
        }

        //Menampilkan Hasil Akhir (Pesawat Terbesar)
        System.out.println("===========================================");
        System.out.println("Pesawat dengan muatan terbanyak adalah: " + namaPesawatTerbesar);
        System.out.println("Dengan kapasitas: " + maxMuatan + " orang.");
        System.out.println("===========================================");
    }
}
