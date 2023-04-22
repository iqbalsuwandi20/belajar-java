package classes;

import java.util.Arrays;

/**
 * Membuat Arrays Class
 */
public class ArraysApp {
    public static void main(String[] args) {
        
        int[] numbers = {
            1,13123,423234324,6456564,423442,8687868,23424
        };

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 23424));
        System.out.println(Arrays.binarySearch(numbers, 100));

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(result);

        int[] result2 = Arrays.copyOfRange(numbers, 2, 6);
        System.out.println(result2);
    }
}
