/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum18052026;

/**
 *
 * @author USER
 */
public class pembayaranTransfer extends Pembayaran {
    private String namaBank;

    public pembayaranTransfer(String namaBank, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaBank = namaBank;
    }

    public String getNoRek() {
        return namaBank;
    }

    public void setNoRek(String namaBank) {
        this.namaBank = namaBank;
    }
    
    @Override
    public void prosesPembayaran(){
        System.out.println("Pembayaran melalui Transfer");
        System.out.println("E Wallet: "+namaBank);
        System.out.println("id transaksi:"+idTransaksi);
        System.out.println("jumlah Bayar:"+jumlahBayar);
    }
    
    public void CetakStruk(){
        System.out.println("Pembayaran melalui Transfer");
        System.out.println("E Wallet: "+namaBank);
        System.out.println("id transaksi:"+idTransaksi);
        System.out.println("jumlah Bayar:"+jumlahBayar);
   }
}