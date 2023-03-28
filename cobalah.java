/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class cobalah {
     public static void main(String[] args) {
     Line coba = new Line(2.5,3,4,5);
     Line pertama = new Line(3,4,5,6);
     coba.getLength();
     coba.isGreater(coba, pertama);
        System.out.println(coba.isEqual(coba, pertama));
    }

}
