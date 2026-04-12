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
public class PersegiPanjangEnkapsulasi {
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0;
    
    public PersegiPanjangEnkapsulasi(){
        jumlahObjek++;
    }
    
    //kontruktor dengan parameter
    public PersegiPanjangEnkapsulasi(int panjangBaru, int lebarBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
        jumlahObjek++;
    }
    
    // setter panjang
    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }
    
    // getter panjang
    public int getPanjang() {
        return panjang;
    }
    
    // setter lebar
    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }
    
    // getter lebar
    public int getLebar(){
        return lebar;
    }
    
    //getter jumlah objek
    public static int getJumlahObjek() {
        return jumlahObjek;
    }
    
    // hitung luas
    public int getLuas() {
        return (panjang * lebar);
    }

    // hitung keliling
    public int getKeliling() {
        return (2 * (panjang + lebar));
    }
    
}
