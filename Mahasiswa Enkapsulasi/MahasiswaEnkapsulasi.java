/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum06042026;

/**
 *
 * @author USER
 */
public class MahasiswaEnkapsulasi {
    // Atribut (private)
    private String nama;
    private String nim;
    private String jurusan;
    private int umur;
    private double ipk;
    
    // Konstruktor kosong
    public MahasiswaEnkapsulasi() {
    }
    
    // Konstruktor dengan parameter
    public MahasiswaEnkapsulasi(String nama, String nim, String jurusan, int umur, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.umur = umur;
        this.ipk = ipk;
    }
    
    // Getter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public int getUmur() {
        return umur;
    }

    public double getIpk() {
        return ipk;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
// Method menampilkan info
    public void info() {
        System.out.println("===== DATA MAHASISWA =====");
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Umur     : " + umur);
        System.out.println("IPK      : " + ipk);
    }

    // Method status kelulusan
    public String statusKelulusan() {
        if (ipk >= 2.75) {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }

}
