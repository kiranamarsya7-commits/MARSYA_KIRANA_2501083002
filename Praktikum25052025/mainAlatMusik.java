/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum25052026;

/**
 *
 * @author USER
 */
public class mainAlatMusik {
    public static void main(String[] args) {
       //membuat objek statis
       Gitar gitar = new Gitar("Klasik", "Petik",6);
       Keyboard keyboard = new Keyboard("Yamaha", "Elektronik", true);
       
       System.out.println("\n Alat Musik Gitar");
       gitar.info();
       gitar.mainkan();
       gitar.stem();
       
       System.out.println("\n---Info Alat Musik Keyboard---");
       keyboard.info();
       keyboard.nyalakan();
       keyboard.mainkan();
       keyboard.stem();
       keyboard.matikan();
    }
    
}
