/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas180526;

/**
 *
 * @author LAB_P1_PC02
 */
public class karyawanTetap extends Karyawan{
    private double gaji;
    private double tunjangan;
    private double total;

    public karyawanTetap(double gaji, double tunjangan, double total, String nama, int jenis) {
        super(nama, jenis);
        this.gaji = gaji;
        this.tunjangan = tunjangan;
        this.total = total;
    }
    

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getTunjangan() {
        return tunjangan ;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    public double getTotal(){
        return total;
    }
    
    @Override
    public void Karyawan(){
        System.out.println("----- Karyawan Tetap -----");
        System.out.println("gaji = "+gaji);
        System.out.println("tunjangan: "+tunjangan);
        System.out.println("total Gaji: "+total);
    }}