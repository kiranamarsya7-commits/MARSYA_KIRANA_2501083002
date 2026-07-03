/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum18052026;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class mainPembayaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //deklarasi variable objek dengan inisialisasi nilai awal null
        Pembayaran pembayaran = null;
        
        System.out.println("------ Sistem Pembayaran Toko Online ------");
        System.out.print("Masukkan id transaksi:");
        String id = in.nextLine();
        
        System.out.print("masukkan jumlah bayar : ");
        double jumlah = in.nextDouble();
        
        System.out.println("pilih metode pembayaran :");
        System.out.println("1. Transfer Bank");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet\n4. Cash/Tunai");
        
        System.out.print("Pilih metode pembayaran:");
        int pilihan = in.nextInt();
        in.nextLine();  
        
        switch(pilihan){
            case 1: System.out.println("metode pembayaran menggunakan Transfer");
                    System.out.print("masukkan nama bank tujuan: ");
                    String bank = in.nextLine();
                    pembayaran = new pembayaranTransfer(bank,jumlah,id);
                    break;
                    
            case 2: System.out.println("metode pembayaran menggunakan Kartu Kredit");
                    System.out.print("masukkan nomor kartu: ");
                    String no = in.nextLine();
                    pembayaran = new pembayaranTransfer(no,jumlah,id);
                    break;
                    
            case 3: System.out.println("metode pembayaran menggunakan E-Wallet");
                    System.out.print("masukkan nama E_Wallet:");
                    String nama = in.nextLine();
                    pembayaran = new pembayaranTransfer(nama,jumlah,id);
                    break;
                    
            case 4: System.out.println("Metode pembayaran menggunakan tunai");
                    System.out.print("jumlah uang:");
                    double uang = in.nextDouble();
                    pembayaran = new PembayaranTunai(uang,jumlah,id);
                    
                    break;
        }
        
        System.out.println("\nkonfirmasi bukti pembayaran");
        pembayaran.prosesPembayaran();
    }
    
}