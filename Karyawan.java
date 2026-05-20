/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas180526;

/**
 *
 * @author LAB_P1_PC02
 */
public abstract class Karyawan {
    protected String nama;
    protected int jenis;

    public Karyawan(String nama, int jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJenis() {
        return jenis;
    }

    public void setJenis(int jenis) {
        this.jenis = jenis;
    }
    
    public abstract void Karyawan();
    
}

