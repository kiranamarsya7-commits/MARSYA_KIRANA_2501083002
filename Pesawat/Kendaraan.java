
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
public class Kendaraan {
     // atribut (private)
    private String nama;
    private int tahunProduksi;
    private boolean mesin;

    // kontruktor tanpa parameter
    public Kendaraan() {
        this.nama = "";
        this.tahunProduksi = 0;
        this.mesin = false;
    }
    
    // kontruktor dengan parameter
    public Kendaraan(String nama, int tahunProduksi, boolean mesin) {
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
        this.mesin = mesin;
    }
    
    // getter nama
    public String getNama() {
        return nama;
    }

    // setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // getter tahun produksi
    public int getTahunProduksi() {
        return tahunProduksi;
    }

    // setter tahun produksi
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
    
    // getter mesin
    public boolean getMesin(){
        return mesin;
    }
    
    // setter mesin
    public void setMesin(boolean mesin){
        this.mesin = mesin;
    }

    // method cetak
    public void cetak() {
        System.out.println("Nama Kendaraan   : " + nama);
        System.out.println("Tahun Produksi   : " + tahunProduksi);
        System.out.println("Mesin : " + (mesin ? "Tersedia" : "Tidak Ada" ));
    }
}
