
import java.util.Scanner;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
class Bus {
    /*public int penumpang,maxpenumpang,penum;
    
    public void cetak(){
        if (penumpang==maxpenumpang) { 
            System.out.println("Penumpang sekarang = "+penumpang);
            System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
            System.out.println("Batas penumpang sudah penuh");
        }else if(penumpang<maxpenumpang){
            System.out.println("Penumpang sekarang = "+penumpang);
            System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
            System.out.println("Masih ada kursi kosong");
        }else if(penumpang>maxpenumpang){
            System.out.println("Penumpang sekarang = "+penumpang);
            System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
            System.out.println("Penumpang melebihi kursi");
        }*/
    
    /*private int penumpang,maxpenumpang;
 
    // konstruktor
    public Bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    
    //method mutator 
    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            System.out.println("Masih ada kosong");
            this.penumpang=temp;
        }
        
    }*/
    /*public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);*/
    
    
    private int penumpang;
    private final int maxpenumpang;
    private double counter;

    public Bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    
    public void addpenumpang(int penumpang){
        this.penumpang+=penumpang;
    }
    
    public double addberat(){
        Scanner ab = new Scanner(System.in);
        System.out.println("Masukkan berat badan : ");
        double a = ab.nextInt();
        return this.counter +=a;
    }
    
    public double getPenumpang (double penumpang){
        return penumpang;
    }
    
    public void getAverange(){
        double c = getCounter() / getPenumpang();
        System.out.println("Berat rata-rata penumpang : "+c);
    }
    
   public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        //System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
        getAverange();
    }
    
    public int getPenumpang() {
    return penumpang;
    }

    public int getMaxpenumpang() {
        return maxpenumpang;
    }
    
    public double getCounter() {
        return counter;
    }
    }



