package lambda.app;

import java.util.Optional;

/**
 * Lambda di Optional Class
 */
public class OptionalApp {
    public static void main(String[] args) {

        sayHello("Iqbal");

        String name = null;

        sayHello(name);
        
    }

    public static void sayHello(String name) {
        Optional.ofNullable(name)
            .map(String::toUpperCase)
            // Mengambil Data di Optional
            .ifPresentOrElse(
                value -> System.out.println("HELLO " + value),
                () -> System.out.println("HELLO")
                );

        // Optional<String> optionalName = Optional.ofNullable(name);

        // Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());

        // optionalNameUpper.ifPresent(value -> System.out.println("HELLO " + value));
    }
}
