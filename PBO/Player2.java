/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Player2 {
     private int health = 100;
    private boolean defending = false;

    public int getHealth() {
        return health;
    }

    public int attack() {
        return (int) (Math.random() * 25 + 1);
    }

    public void defend() {
        defending = true;
    }

    public void takeDamage(int damage) {
        if (defending) {
            damage /= 2;
            defending = false;
        }
        health -= damage;
    }
}

class Enemy {
    private int health = 100;

    public int getHealth() {
        return health;
    }

    public int attack() {
        return (int) (Math.random() * 25 + 1);
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
}
