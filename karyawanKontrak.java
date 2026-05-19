/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas180526;

/**
 *
 * @author LAB_P1_PC02
 */
public class karyawanKontrak extends Karyawan{
    private double gaji;
    private double total;
    private double jam;

    public karyawanKontrak(double gaji, double total, double jam, String nama, int jenis) {
        super(nama, jenis);
        this.gaji = gaji;
        this.total = total;
        this.jam = jam;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getTotal() {
        return total = gaji*jam;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getJam() {
        return jam;
    }

    public void setJam(double jam) {
        this.jam = jam;
    }
    
    @Override
    public void Karyawan(){
        System.out.println("===Karyawan Kontrak===");
        System.out.println("gaji = "+gaji);
        System.out.println("jumlah jam kerja: "+jam);
        System.out.println("total Gaji dalam 1 bulan: "+total);
    }
}
