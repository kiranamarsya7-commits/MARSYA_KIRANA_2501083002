/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum27042026;

/**
 *
 * @author USER
 */
public class Udara extends Kendaraan{
    private boolean mesin;

    //kontruktor kosong
    public Udara() {
    }

    //kontruktor lengkap
    public Udara(String nama, int tahunProduksi, boolean mesin) {
        super(nama,tahunProduksi,mesin);
        this.mesin = mesin;
    }
    
    //getter mesin
    public boolean getMesin() {
        return mesin;
    }

    //setter mesin
    public void setMesin(boolean mesin) {
        this.mesin = mesin;
    }
    
    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Menggunakan Mesin : " + (mesin ? "Ya" : "Tidak"));
    }
}
