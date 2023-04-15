package belajarjavapack.data;

// Cara membuat default method
public class Bus implements Car {
    @Override
    public void drive() {
        System.out.println("Bus drive");
    }
    @Override
    public int getTier() {
        return 8;
    }
    @Override
    public String getBrand() {
        return "Hino";
    }
    @Override
    public boolean isBig() {
        return true;
    }
}
