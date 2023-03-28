/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Hitung {
        public static void main(String[] args) {
        //Hitung 1
        /*BangunDatar hitunglah=new BangunDatar();
        
        hitunglah.luas(2, 5, 6);
        hitunglah.luas(3.5, 6.9);
    }*/
    
        BangunDatar bangundatar=new BangunDatar();
        bangundatar.r=20;
        bangundatar.d=15;
        
        persegi Persegi = new persegi();
        Persegi.sisi=8;
        
        Persegipanjang perjang =new Persegipanjang();
        perjang.lebar=11;
        perjang.panjang=2;
        
        
       bangundatar.luas();
       bangundatar.keliling();
       
       Persegi.luas();
       Persegi.keliling();
       
       perjang.luas();
       perjang.keliling();
        
    }
}
