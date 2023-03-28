
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Ujibus {
    public static void main(String[] args) {
    
        /*Bus busMini=new Bus();
        busMini.penumpang=0;
        busMini.maxpenumpang=15;
        //busMini.cetak();
        
        Scanner ab = new Scanner(System.in);
        do{
        System.out.print("Masukkan jumlah penumpang : ");
        busMini.penu=ab.nextInt();
        busMini.penumpang+=busMini.penu;
        
        busMini.cetak();
        }while(busMini.penumpang<busMini.maxpenumpang);*/
        
        /*Bus miniBus = new Bus();
        miniBus.penumpang=5;
        miniBus.maxpenumpang=10;
        
        miniBus.penumpang=miniBus.penumpang+5;
        miniBus.penumpang=miniBus.penumpang+6;
        miniBus.penumpang=miniBus.penumpang+3;
        miniBus.cetak("Bus mini");
        
        System.out.println("");
        
        Bus bigBus = new Bus();
        bigBus.penumpang=40;
        bigBus.maxpenumpang=50;
        
        bigBus.penumpang=bigBus.penumpang+5;
        bigBus.penumpang=bigBus.penumpang+10;
        bigBus.penumpang=bigBus.penumpang+35;
        bigBus.cetak("Big bus");*/
        
        
        /*Latihan 2
        Scanner ab = new Scanner(System.in);
        System.out.println("Masukkan batas penumpang : ");
        int b = ab.nextInt();
        Bus busMini = new Bus(b);
        
        System.out.println("Masukkan penumpang");
        int c = ab.nextInt();
        busMini.pluspenumpang(c);
        busMini.cetak();*/
        
        Scanner ab = new Scanner(System.in);
        
        Bus busMini=new Bus(10);
        
        for (int i = 0; i < 10; i++) {
        System.out.println("\nMasukkan penumpang: ");
        int a = ab.nextInt();
        busMini.addpenumpang(a);
        busMini.addberat();
        }
        busMini.cetak();
    }
}
