/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum08062026;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class CekArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka ={10, 20, 30, 40, 50};
        
        try{
        System.out.print("Mau membagi angka index ke berapa= ");
        
        int index = input.nextInt();
        System.out.println("Angka pada indeks "+index+" adalah "+angka[index]);
        
        int pembagi = input.nextInt();
        
        int hasil = angka[index]/pembagi;
        System.out.println("hasil pembagian = "+hasil);
        }
        
        //1.Exception Array diluar jangkauan
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index array tidak ada, masukkan 0-4");
            }
        //2.Input tidak sesuai
            catch(InputMismatchException e) {
                System.out.println("Pastikan input berupa angka");
            }
        //3.Pembagian dengan nol
            catch(ArithmeticException e){
                System.out.println("Tidak boleh pembagian dengan 0");
            }
            finally{
                System.out.println("Proses selesai");
                System.out.println("cara 1");
                for(int i=0; i<angka.length; i++)
                    System.out.print(" "+angka[i]);
                System.out.println("\n cara 2");
                System.out.println("isi array : "+java.util.Arrays.toString(angka));
                //tampilan isi array
                
                
        }
        
    }
    
}
