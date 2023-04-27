package lambda.app;

import java.util.function.Function;
import java.util.function.Predicate;

import lambda.util.StringUtil;

/**
 * Method Reference
 */
public class MethodReferenceApp {
    public static void main(String[] args) {
        
        /**
         * Method Reference Static
         */
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("iqbal"));
        System.out.println(predicateIsLowerCase.test("Iqbal"));

        /**
         * Method Reference Parameter
         */
        Function <String, String> functionToUpper = String:: toUpperCase;

        System.out.println(functionToUpper.apply("iqbal"));
    }

    /**
     * Method Reference Non Static
     */
    public void run() {
        Predicate <String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("iqbal"));
        System.out.println(predicateIsLowerCase.test("Iqbal"));
    }

    /**
     * Method Reference Object
     */
    public void run2() {
        MethodReferenceApp app = new MethodReferenceApp();

        Predicate <String> predicateIsLowerCase = app::isLowerCase;

        System.out.println(predicateIsLowerCase.test("iqbal"));
        System.out.println(predicateIsLowerCase.test("Iqbal"));
    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
