package classes;

import java.util.StringTokenizer;

/**
 * Membuat StringTokenizer Class
 */
public class StringTokenNizerApp {
    public static void main(String[] args) {
        
        String value = "Iqbal Suwandi";
        
        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        while(tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}
