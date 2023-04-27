package lambda.app;

import java.util.function.Predicate;

/**
 * Package java.util.function
 */
public class PredicateApp {
    public static void main(String[] args) {
        
        /**
         * Menggunakan Predicate
         */
        Predicate<String> predicateCheckBlank = value -> value.isBlank();

        System.out.println(predicateCheckBlank.test(""));
        System.out.println(predicateCheckBlank.test("Iqbal"));
    }
}
