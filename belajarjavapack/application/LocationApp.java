package belajarjavapack.application;

import belajarjavapack.data.City;

// Cara membuat abstract class
public class LocationApp {
    public static void main(String[] args) {
        // Cara mengakses abstract class
        // Location location = new Location(); Error

        City city = new City();
        city.name = "Tangerang";

        System.out.println(city.name);
    }
}
