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
public class MainPointLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // buat point
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);

        // buat line (komposisi)
        Line line = new Line(p1, p2);

        System.out.println(line);

        // ubah nilai
        line.setBeginXY(3, 3);
        line.setEndXY(6, 8);

        System.out.println("Setelah diubah:");
        System.out.println(line);

        // panjang garis
        System.out.println("Panjang garis: " + line.getLength());
    }
}
