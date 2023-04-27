package lambda.app;

import java.util.function.Function;

/**
 * Package java.util.function
 */
public class FunctionApp {
    public static void main(String[] args) {
        
        /**
         * Menggunakan Function
         */
        Function<String, Integer> functionLength = value -> value.length();
        System.out.println(functionLength.apply("Iqbal"));
    }
}
