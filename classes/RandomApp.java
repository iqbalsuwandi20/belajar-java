package classes;

import java.util.Random;

/**
 * Membuat Random Class
 */
public class RandomApp {
    public static void main(String[] args) {
        
        Random random = new Random();

        for (int i = 0; i < 5000; i++) {
            int value = random.nextInt(5000);
            System.out.println(value);
        }
    }
}
