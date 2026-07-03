/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum02032026;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class PersegiPanjang {
    int panjang;
    int lebar;
    
    //constructor
    PersegiPanjang(int p, int l){
        panjang = p;
        lebar = l;
    }
    
    //method hitung luas
    int hitungLuas(){
        return(panjang*lebar);
    }
    
    //method hitung keliling
    int hitungKeliling(){
        return(2*panjang+lebar);
    }
    
}