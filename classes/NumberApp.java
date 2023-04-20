package classes;

/**
 * Membuat Number Class
 */
public class NumberApp {
    public static void main(String[] args) {
        
        Integer intValue = 30;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();

        System.out.println(longValue);
        System.out.println(doubleValue);

        /**
         * Konversi String ke Number
         */
        String contoh = "100.90";

        Double contohDouble = Double.valueOf(contoh);
        System.out.println(contohDouble);
    }   
}
