package belajarjavapack.data;

// Cara membuat package
// Cara membuat access modifier
public class Product {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    } 

    // Cara membuat toString() method
    public String toString() {
        return "Product name: " + name + ", price: " + price;
    }
}