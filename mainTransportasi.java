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
public class mainTransportasi {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Transportasi Trans = null;
        
        System.out.println("===Sistem Pemesanan Transportasi===");
        System.out.print("Masukkan nama pelanggan:");
        String nama = in.nextLine();
        
        System.out.print("masukkan tujuan : ");
        String tujuan = in.nextLine();
        
        System.out.println("Pilih jenis transportasi :");
        System.out.println("1. Mobil \n2. Motor \n3. Bis \n4. Kereta");
        
        
        System.out.print("Pilih Transportasi:");
        int pilihan = in.nextInt();
        in.nextLine();  
        
        switch(pilihan){
            case 1: System.out.println("metode transportasi yang dipilih: Mobil");
                    System.out.print("masukkan biaya ongkos: ");
                    double biayaM = in.nextDouble();
                    Trans = new Mobil(biayaM,tujuan, nama);
                    break;
                    
            case 2: System.out.println("metode transportasi yang dipilih: Motor");
                    System.out.print("masukkan biaya ongkos: ");
                    double biayaMo = in.nextDouble();
                    Trans = new Motor(biayaMo,tujuan, nama);
                    break;
                    
            case 3: System.out.println("metode transportasi yang dipilih: Bis");
                    System.out.print("masukkan biaya ongkos: ");
                    double biayaB = in.nextDouble();
                    Trans = new Bis(biayaB,tujuan, nama);
                    break;
                    
            case 4: System.out.println("metode transportasi yang dipilih: Kereta");
                    System.out.print("masukkan biaya ongkos : ");
                    double biayaK = in.nextDouble();
                    Trans = new Kereta(biayaK,tujuan, nama);
                    break;
        }
        
        System.out.println("\nkonfirmasi bukti pembayaran");
        Trans.jenisTransport();
    }
}
