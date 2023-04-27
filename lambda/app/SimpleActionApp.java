package lambda.app;

import lambda.SimpleAction;

/**
 * Pengenalan Lambda
 */
public class SimpleActionApp {
    public static void main(String[] args) {

        /**
         * Membuat Lambda
         */
        SimpleAction simpleAction = () -> {
            return "Iqbal";
        };

        System.out.println(simpleAction.action());
    }
}
