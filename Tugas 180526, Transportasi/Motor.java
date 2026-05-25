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
public class Motor extends Transportasi {
    private double biaya;
    private String tujuan;

    public Motor(double biaya, String tujuan, String nama) {
        super(nama);
        this.biaya = biaya;
        this.tujuan = tujuan;
    }

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
    
    @Override
    public void jenisTransport(){
        System.out.println("Perjalanan menggunakan Motor");
        System.out.println("nama pelanggan: "+nama);
        System.out.println("Tujuan Perjalanan: "+tujuan);
        System.out.println("Biaya Perjalanan: "+biaya);
    }   
}
