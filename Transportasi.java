/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas180526;

/**
 *
 * @author LAB_P1_PC02
 */
    
public abstract class Transportasi {
    protected String nama;

    public Transportasi(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    //method polymorphism
    public abstract void jenisTransport();
    
    }
