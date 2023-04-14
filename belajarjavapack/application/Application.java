package belajarjavapack.application;

// Cara mengakses import
import belajarjavapack.data.*;

public class Application {
    public static void main(String[] args) {
        // Cara mengakses access modifier
        Product product = new Product("ROG", 26_000_000);

        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
