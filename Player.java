import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Player {
    Scanner ab = new Scanner(System.in);
    
    void attack(){
        int menampar = 10;
        int menendang = 10;
        int menonjok = 10;
    }
    
    void Player(){
       //attack damage
        System.out.println("Masukkan Nama Player : ");
        String b = ab.nextLine();
        System.out.println("Masukkan Armor  : ");
        int c = ab.nextInt();
        System.out.println("Masukkan Speed ");
        int d = ab.nextInt();
        System.out.println("Masukkan Health Point : ");
        int f = ab.nextInt();
    }
        
    void Musuh(){
      Random rand = new Random();
      int damage = 100;
      int random = rand.nextInt(damage);
      System.out.println("Attack Damage Musuh" + (damage-1) + " : " + random);
      
      int armor = 100;
      int random1 = rand.nextInt(armor);
      System.out.println("Attack Damage Musuh" + (armor-1) + " : " + random1);
      
      int speed = 100;
      int random2 = rand.nextInt(armor);
      System.out.println("Attack Damage Musuh" + (armor-1) + " : " + random2);
      
      int hp = 100;
      int random3 = rand.nextInt(hp);
      System.out.println("Attack Damage Musuh" + (armor-1) + " : " + random3);
      
    }
}
    

