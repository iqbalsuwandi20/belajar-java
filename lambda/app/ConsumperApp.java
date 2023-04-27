package lambda.app;

import java.util.function.Consumer;

/**
 * Package java.util.function
 */
public class ConsumperApp {
    public static void main(String[] args) {

        /**
         * Menggunakan Consumer
         */
        Consumer<String> consumer = value -> System.out.println(value);
        consumer.accept("Iqbal Suwandi");
    }
}
