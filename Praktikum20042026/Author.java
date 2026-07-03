/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum20042026;

/**
 *
 * @author USER
 */
public class Author {
    //private variabel
    private final String name;
    private String email;
    private final char gender; //'m' or ' f'
    
    // kontruktor author saat input
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    //public getter dan setter
    //tidak ada setter untuk nama dan gender
    public String getName(){
        return name; 
    }
    //returns gender
    public char getGender(){
        return gender; 
    }
    //returns email
    public String getEmail(){
        return email; 
    }
    
    //Sets email
    public void setEmail(String email){
        this.email = email; 
    }
    
    //return perkenalan 
    public String toString(){
        return name + " (" + gender + ") at " + email;
    }
}
