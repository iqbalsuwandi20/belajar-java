package classes;

import java.util.Base64;

/**
 * Membuat Base64 Class
 */
public class Base64App {
    public static void main(String[] args) {
        
        String originalString = "Iqbal Suwandi";

        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println(encodedString);

        byte[] bytes = Base64.getDecoder().decode(encodedString);
        String resultString = new String(bytes);
        System.out.println(resultString);
    }
}
