package belajarjavapack.application;

import belajarjavapack.data.Animal;
import belajarjavapack.data.Cat;

// Cara mengakses abstract method
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Miko";
        animal.run(); 
    }
}
