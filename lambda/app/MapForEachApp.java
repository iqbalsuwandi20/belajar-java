package lambda.app;

import java.util.HashMap;
import java.util.Map;

/**
 * Lambda di Collection
 */
public class MapForEachApp {
    public static <T, U> void main(String[] args) {
        
        /**
         * Menggunakan Map.foEach
         */
        Map<String, String> map = new HashMap<>();
        map.put("first_name", "Iqbal");
        map.put("first_middle", "Suwandi");
        map.put("first_last", "Steven");
        
        // lambda
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
