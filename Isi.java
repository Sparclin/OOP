
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Isi extends Harga {

    private int barang,bayar,bayar2,harga,harga2;
    
    public void setBarang(int barang){
        this.barang=barang;
    }
    
    public void setBayar1(int bayar){
        this.bayar=bayar*harga;
    }
    
    public void setBayar2(int bayar){
        this.bayar=bayar2*harga2;
    }
    
    public void getKeripik(int keripik){
        this.keripik=super.keripik=harga;
    }
    
    public void getTahu(int tahu){
        this.tahu=super.tahu=harga2;
    }
    
    public static void cetak() {
        Scanner ab = new Scanner(System.in);
        
        System.out.print("Ingin beli apa?"+"\n1.Keripik kaca"+"\n2.Tahu isi"); 
        int a = ab.nextInt();
        if (a==1) {
            System.out.print("Masukkan jumlah barang : ");
            int b = ab.nextInt();
            System.out.println("Harga yang harus dibayar : ");
            System.out.println("Barang yang ada beli : "+a);
            System.out.println("Jumlah barang : "+b);
        }else{
            System.out.print("Masukkan jumlah barang : ");
            int b = ab.nextInt();
            System.out.println("Harga yang harus dibayar : ");
            System.out.println("Barang yang ada beli : "+a);
            System.out.println("Jumlah barang : "+b);
    }
  }
}
