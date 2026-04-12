/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum06042026;

/**
 *
 * @author USER
 */
public class AkunBankEnkapsulasi {
   // Atribut (private = enkapsulasi)
    private String noRekening;
    private String namaNasabah;
    private double saldo;

    // kontruktor
    public AkunBankEnkapsulasi(String noRekening, String namaNasabah, double saldoAwal) {
        this.noRekening = noRekening;
        this.namaNasabah = namaNasabah;
        this.saldo = saldoAwal;
    }

    // Getter
    public String getNoRekening() {
        return noRekening;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public double getSaldo() {
        return saldo;
    }

    // Method tampil data
    public void tampilData() {
        System.out.println("No Rekening : " + noRekening);
        System.out.println("Nama        : " + namaNasabah);
        System.out.println("Saldo       : " + saldo);
    }

    // Method deposit (menabung)
    public void deposit(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Deposit berhasil: " + jumlah);
        } 
        else {
            System.out.println("Jumlah deposit tidak valid!");
        }
    }

    // Method withdraw (mengambil)
    public void withdraw(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Withdraw berhasil: " + jumlah);
        } 
        else {
            System.out.println("Saldo tidak cukup!");
        }
    }
}