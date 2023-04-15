package belajarjavapack.application;

public class EqualsApp {
    public static void main(String[] args) {
        // Cara membuat equals() method
        String first = "Iqbal";
        first = first + " " + "Suwandi";
        System.out.println(first);

        String second = "Iqbal Suwandi";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Iqbal Suwandi";
        System.out.println(second == third);
        
        System.out.println(second.equals(third));
    }
}
