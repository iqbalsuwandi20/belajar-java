package classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Membuat Regular Expression
 */
public class RegularExpression {
    public static void main(String[] args) {
        
        String nameString = "Iqbal Suwandi Programmer Zaman Now";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(nameString);

        while (matcher.find()) {
            String resultString = matcher.group();
            System.out.println(resultString);
        }
    }
}
