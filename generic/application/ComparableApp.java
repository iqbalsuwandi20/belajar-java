package generic.application;

import java.util.Arrays;

import generic.Person;

/**
 * Mengakses Comparable Interface
 */
public class ComparableApp {
    public static void main(String[] args) {
        
        Person[] people = {
            new Person("Iqbal", "Tangerang"),
            new Person("Steven", "Tangerang"),
            new Person("garuls", "Tangerang")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
