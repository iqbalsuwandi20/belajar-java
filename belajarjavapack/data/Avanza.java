package belajarjavapack.data;

// Cara membuat interface
// Cara membuat interface heritance
// Cara membuat multiple interface inheritance 
public class Avanza implements Car, IsMaintenance {
    @Override
    public void drive() {
        System.out.println("Avanza drive");
    }
    @Override
    public int getTier() {
        return 4;
    }
    @Override
    public String getBrand() {
        return "Toyota";
    }
    @Override
    public boolean isMaintenance() {
        return false;
    }
}
