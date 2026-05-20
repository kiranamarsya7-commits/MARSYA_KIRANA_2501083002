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
public class MainBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author Rin = new Author ("Rinaldi Munir", "rinaldi@gmail.com",'m');
        System.out.println(Rin); //Author's toString
        //Rinaldi Munir (m) at rinaldi@gmail.com
        
        //test  book's constructor and toString()
        Book dummyBook = new Book ("Algoritma dan Pemograman", Rin, 98000, 99);
        System.out.println(dummyBook); //book's toString()
        //algoritma dan pemograman Rinaldi Munir (m) at rinaldi@gmail.com
        
        //test stter and getters
        dummyBook.setPrice(120000);
        dummyBook.setQty(88);
        System.out.println("name is : "+ dummyBook.getName());
        //name is : algoritma dan pemograman
        System.out.println("price is : "+ dummyBook.getPrice());
        //price is : 120000
        System.out.println("qty is : "+ dummyBook.getQty());
        //qty is : 88
        System.out.println("author's is : "+ dummyBook.getAuthor());
        //author is : rinaldi munir (m) rinaldi@gmail.com
        System.out.println("author's name is : "+ dummyBook.getAuthor().getName());
        //author's name is : rinaldi munir
        System.out.println("author's email is : "+ dummyBook.getAuthor().getEmail());
        //author's email is : rinaldi@gmail.com
        System.out.println("author's gender is : "+ dummyBook.getAuthor().getGender());
        //author's gender is : m
        
        //Using an anonymous Author  instance to create a Book 
        Book moreDummyBook = new Book ("Java for more dummies",new Author ("Peter Lee","peter@nowhere.com", 'm'), 199.99,8);
        System.out.println(moreDummyBook); // Book toString()
        //java for dummies by peter lee (m) at peter@nowhere.com
        
    }
    
}