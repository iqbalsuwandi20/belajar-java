package belajarjavapack.application;

import belajarjavapack.annotation.Fancy;
import belajarjavapack.data.Animal;
import belajarjavapack.data.Cat;

// Cara mengakses abstract method
// Cara mengakses Annotation
@Fancy(name = "AnimalApp", tags = {"Application", "Java"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Miko";
        animal.run(); 
    }
}
