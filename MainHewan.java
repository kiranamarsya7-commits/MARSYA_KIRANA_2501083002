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
public class MainHewan {

public static void main(String[] args){
    //pembuatan objek
    Hewan hewanku = new Hewan("Makhluk hidup");
    Kucing kucingku = new Kucing("Bobby");
    Anjing anjingku = new Anjing("Helly");
    
    //megakses super class
    System.out.println("Tampilkan akses super class Hewan");
    hewanku.tampilkanNama();
    hewanku.bersuara();
    
    //mengakses sub class Kucing
    System.out.println("\nTampilkan akses sub class Kucing");
    kucingku.tampilkanNama();
    kucingku.bersuara();    
    
    }    
}
