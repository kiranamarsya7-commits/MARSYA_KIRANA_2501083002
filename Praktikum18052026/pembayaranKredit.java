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
public class pembayaranKredit extends Pembayaran {
    private String noKartu;

    public pembayaranKredit(String noKartu, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.noKartu = noKartu;
    }

    public String getNoKartu() {
        return noKartu;
    }

    public void setNoKartu(String noKartu) {
        this.noKartu = noKartu;
    }
    
    
    @Override
    public void prosesPembayaran(){
        System.out.println("Pembayaran melalui Kartu Kredit");
        System.out.println("E Wallet: "+noKartu);
        System.out.println("id transaksi:"+idTransaksi);
        System.out.println("jumlah Bayar:"+jumlahBayar);
    }
    
    public void CetakStruk(){
        System.out.println("Pembayaran melalui Kartu Kredit");
        System.out.println("E Wallet: "+noKartu);
        System.out.println("id transaksi:"+idTransaksi);
        System.out.println("jumlah Bayar:"+jumlahBayar);
   }
}