/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas180526;

/**
 *
 * @author LAB_P1_PC02
 */
public class Motor extends Transportasi{
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
