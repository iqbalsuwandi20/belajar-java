package lambda.app;

import java.util.List;
import java.util.function.Consumer;

/**
 * Lambda di Collection
 */
public class ForEachApp {
    public static void main(String[] args) {

        /**
         * Menggunakan Iterable.forEach
         */
        List<String> list = List.of("Iqbal", "Suwandi", "Steven");

        // for loop
        for (var value : list) {
            System.out.println(value);
        }

        // forEeach annonymous class
        list.forEach(new Consumer<>() {

            @Override
            public void accept(String value) {
                System.out.println(value);
            }
            
        });

        // lambda
        list.forEach(value -> System.out.println(value));

        // lambda method reference
        list.forEach(System.out::println);
    }
}
