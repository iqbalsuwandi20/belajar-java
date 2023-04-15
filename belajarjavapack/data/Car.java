package belajarjavapack.data;

// Cara membuat interface
// Cara membuat interface inheritance
// Cara membuat default method
public interface Car extends HasBrand{
    void drive();
    int getTier();

    default boolean isBig() {
        return false;
    }
}
