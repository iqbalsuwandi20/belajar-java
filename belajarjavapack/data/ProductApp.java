package belajarjavapack.data;

public class ProductApp {
    public static void main(String[] args) {
        // Cara mengakses access modifier
        Product product = new Product("Macbook Pro", 30_000_000);

        System.out.println(product.name);
        System.out.println(product.price);

        // Cara mengakses toString() method
        System.out.println(product);
    }
}