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
public class pembayaranEwallet extends Pembayaran implements Cetak{
    private String namaEwallet;
    
    public pembayaranEwallet(String namaEwallet, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaEwallet = namaEwallet;
    }

    public String getNamaEwallet() {
        return namaEwallet;
    }

    public void setNamaEwallet(String namaEwallet) {
        this.namaEwallet = namaEwallet;
    }

    @Override
   public void prosesPembayaran(){
        System.out.println("Pembayaran melalui E Wallaet");
        System.out.println("E Wallet: "+namaEwallet);
        System.out.println("id transaksi:"+idTransaksi);
        System.out.println("jumlah Bayar:"+jumlahBayar);
        
    }
   
    @Override
   public void CetakStruk(){
        System.out.println("Pembayaran melalui E Wallaet");
        System.out.println("E Wallet: "+namaEwallet);
        System.out.println("id transaksi:"+idTransaksi);
        System.out.println("jumlah Bayar:"+jumlahBayar);
   }
    
}
