import java.util.HashSet;
// import java.util.LinkedHashSet;
import java.util.Set;

/**
 * List
 */
public class SetApp {
    public static void main(String[] args) {
        
        /**
         * HashSet dan LinkedHashSet
         */
        Set<String> names = new HashSet<>(); // tidak berurut datanya
        // Set<String> names = new LinkedHashSet<>(); // berurut datanya
        names.add("Iqbal");
        names.add("Suwandi");
        names.add("Steven");
        names.add("Iqbal");
        names.add("Suwandi");
        names.add("Steven");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
