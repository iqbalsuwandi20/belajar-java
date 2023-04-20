package classes;

import java.util.StringJoiner;

/**
 * Membuat StringJoiner Class
 */
public class StringJoinerApp {
    public static void main(String[] args) {
        
        StringJoiner joiner = new StringJoiner(",", "[", "]");

        joiner.add("Iqbal");
        joiner.add("Suwandi");

        String value = joiner.toString();
        System.out.println(value);
    }
}
