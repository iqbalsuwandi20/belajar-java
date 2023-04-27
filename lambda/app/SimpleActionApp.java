package lambda.app;

import lambda.SimpleAction;

/**
 * Pengenalan Lambda
 */
public class SimpleActionApp {
    public static void main(String[] args) {

        /**
         * Membuat Lambda
         * Dengan Parameter (Membuat Lambda)
         * Lambda Tanpa Blok (Membuat Lambda)
         */
        SimpleAction simpleAction = value -> "Hello " + value;

        System.out.println(simpleAction.action("Iqbal"));
    }
}
