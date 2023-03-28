
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Game2 {
     public static void main(String[] args) {
        Player2 player = new Player2();
        Enemy enemy = new Enemy();
        Scanner input = new Scanner(System.in);

        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            System.out.println("Player health: " + player.getHealth());
            System.out.println("Enemy health: " + enemy.getHealth());
            System.out.println("1. Menyerang");
            System.out.println("2. Bertahan");
            System.out.print("Pilihanmu: ");
            int choice = input.nextInt();

            if (choice == 1) {
                int damage = player.attack();
                enemy.takeDamage(damage);
                System.out.println("Serangan mu sebesar " + damage + " damage ke musuh.");
            } else if (choice == 2) {
                player.defend();
                System.out.println("Kamu bertahan dan mengurangi serangan sebesar 50%.");
            } else {
                System.out.println("Invalid choice.");
            }

            if (enemy.getHealth() > 0) {
                int enemyDamage = enemy.attack();
                player.takeDamage(enemyDamage);
                System.out.println("Musuh menyerang sebesar" + enemyDamage + " damage ke kamu.");
            }
        }

        if (player.getHealth() <= 0) {
            System.out.println("You lose!");
        } else {
            System.out.println("You win!");
        }
    }
}

