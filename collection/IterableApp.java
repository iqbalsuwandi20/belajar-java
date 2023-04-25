package collection;

import java.util.List;

/**
 * Iterable dan Iterator
 */
public class IterableApp {
    public static void main(String[] args) {
        
        Iterable<String> names = List.of("Iqbal", "Suwandi", "Steven");

        for (var name : names) {
            System.out.println(name);
        }

    }
}
