/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class BangunDatar {
    //BangunDatar 1
    double luas;
    double a=0.5;
    
    void luas(double panjang , double lebar){
        luas = panjang*lebar;
        System.out.println("luas pertama = "+luas);
    }
    void luas(int panjang, int lebar, int a){
        luas= panjang * lebar*a;
        System.out.println("luas kedua = "+luas);
    }
    
    float phi=(float) 3.14;
    float r,d;
            
    public void luas(){
        float luas=phi*r*r;
        System.out.println("Luas lingkarang = " + luas);
    }
    public void keliling(){
        float keliling=phi*d;
        System.out.println("Keliling lingkarang = " + keliling);
    }    
}
