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
public class AkunBankEnkapsulasiMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        // Input data awal
    System.out.println("=== INPUT DATA AKUN ===");
    System.out.print("Masukkan No Rekening : ");
    String noRek = input.nextLine();

    System.out.print("Masukkan Nama        : ");
    String nama = input.nextLine();

    System.out.print("Masukkan Saldo Awal  : ");
    double saldoAwal = input.nextDouble();

        // Buat objek
    AkunBankEnkapsulasi akun = new AkunBankEnkapsulasi(noRek, nama, saldoAwal);

        // Tampilkan saldo awal
    System.out.println("\n=== SALDO AWAL ===");
    akun.tampilData();

        // Input deposit
    System.out.print("\nMasukkan jumlah deposit : ");
    double deposit = input.nextDouble();
    akun.deposit(deposit);
    System.out.println("Saldo setelah deposit: " + akun.getSaldo());

        // Input withdraw
    System.out.print("\nMasukkan jumlah withdraw : ");
    double withdraw = input.nextDouble();
    akun.withdraw(withdraw);
    System.out.println("Saldo setelah withdraw: " + akun.getSaldo());

    input.close();
    }
}
