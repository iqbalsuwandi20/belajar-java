package generic.application;

import generic.util.ArrayHelper;

/**
 * Membuat Generic Method
 */
public class ArrayHelperApp {
    public static void main(String[] args) {
        
        String[] nameStrings = {"Iqbal", "Suwandi", "Steven"};
        Integer[] numbersIntegers = {1,2,3,4,5};

        System.out.println(
            ArrayHelper.<String>count(nameStrings)
        );

        System.out.println(
            ArrayHelper.count(numbersIntegers)
        );
        
    }
}
