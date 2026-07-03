/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum08062026;
import java.util.Scanner;

public class ContohExceptionTrow {

    static void cekNilai(int nilai)throws Exception{
        if(nilai<0){
            throw new Exception("Nilai tidak boleh negatif");
        }
        else if(nilai>100){
            throw new Exception("Nilai maksimum 100");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Masukkan sebuah angka = ");
            int angka=input.nextInt();
            cekNilai(angka);
        }catch(Exception e){
            System.out.println("gagal : "+e.getMessage());
        }finally{
            System.out.println("Sistem berhasil");
        }
        
    }
    
}
