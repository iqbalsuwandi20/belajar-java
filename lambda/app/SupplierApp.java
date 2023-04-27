package lambda.app;

import java.util.function.Supplier;

/**
 * Package java.util.function
 */
public class SupplierApp {
    public static void main(String[] args) {
        
        /**
         * Menggunakan Supplier
         */
        Supplier<String> supplier = () -> "iqbal suwandi";

        System.out.println(supplier.get());
    }
}
