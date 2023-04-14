package belajarjavapack.application;

import belajarjavapack.data.Avanza;
import belajarjavapack.data.Car;

// Cara mengakses interface
public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}
