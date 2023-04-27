package lambda.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Lambda di Collection
 */
public class RemoveIfApp {
    public static void main(String[] args) {
        
        /**
         * Menggunakan Collection.removeIf
         */
        List<String> names = new ArrayList<>();
        names.addAll(List.of("iqbal", "Suwandi", "Steven"));

        // lambda
        names.removeIf(name -> name.length() > 5);

        System.out.println(names);
    }
}
