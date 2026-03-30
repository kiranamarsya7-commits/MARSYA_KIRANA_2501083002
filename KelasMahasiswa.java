/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum30032026;

/**
 *
 * @author USER
 */
public class KelasMahasiswa {

    //kontruktor
    int tugas, uts, uas;
   
    
    KelasMahasiswa(){
        
    }
    KelasMahasiswa(int a, int b, int c){
        tugas = a;
        uts = b;
        uas = c;
    }
    
    //method
    int hitungNilaiAkhir(){
        return (int) ((tugas*0.25)+(uts*0.35)+(uas*0.4));
    }
}

