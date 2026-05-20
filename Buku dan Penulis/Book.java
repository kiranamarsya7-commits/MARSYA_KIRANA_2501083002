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
public class Book {
    //private variabel
    private final String name;
    private final Author author;
    private double price;
    private int qty;
    
    //kontruktor dari buku dengan author
    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    
    //Returns author
    public String getName(){
        return name;
    }
    //Returns nama dari buku
    public Author getAuthor(){
        return author;
    }
    //Returns harga
    public double getPrice(){
        return price;
    }
    
    //sets price
    public void setPrice(double price){
        this.price = price;
    }
    
    //returns quantity
    public int getQty(){
        return qty;
    }
    
    //sets the quantity
    public void setQty(int qty){
        this.qty = qty;
    }
    
    //return perkenalan diri string
    public String toString(){
        return "'" + name + "' by " + author; //author toString
    }
}
