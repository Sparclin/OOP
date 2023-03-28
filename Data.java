
import java.util.Scanner;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Data extends Data2 {
    Scanner ab = new Scanner(System.in);
    String nama ="Diah";
    
    void setNama(String nama){
        this.nama=nama;
    }
    
    public void Cetak(){
        System.out.println("Nama karyawan : "+this.nama);
        System.out.println("Nomor karyawan : "+super.nomor);
        System.out.println("Gaji utama : "+super.gaji1);
        System.out.println("Gaji bekerja dengan benar : "+super.gaji2);
    }
    
}