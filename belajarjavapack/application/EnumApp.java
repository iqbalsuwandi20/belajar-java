package belajarjavapack.application;

import belajarjavapack.data.Customer;
import belajarjavapack.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        
        // Cara mengakses enum class
        Customer customer = new Customer();
        customer.setName("Iqbal");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());

        // Cara mengakses members enum
        System.out.println(customer.getLevel().getDescription());

        // Cara konversi enum ke string
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        // Cara mengambil enum values
        System.out.println("Print Level");
        for (var value : Level.values()) {
            System.out.println(value);
        }

    }

}
