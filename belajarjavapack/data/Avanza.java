package belajarjavapack.data;

// Cara membuat interface
public class Avanza implements Car {
    @Override
    public void drive() {
        System.out.println("Avanza drive");
    }
    @Override
    public int getTier() {
        return 4;
    }
}
