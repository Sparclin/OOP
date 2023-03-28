/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class AeroPlan extends Vehicle {
    @Override
    public void walk(){
        System.out.println("Terbang");
    }
    
    @Override
    public void fuel(){
            System.out.println("Fuel = 50%");
    }

    @Override
    void type() {
        System.out.println("Pesawat Terbang");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        AeroPlan garuda = new AeroPlan() {};
        garuda.type();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
