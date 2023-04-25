package generic.application;

import java.util.Arrays;
import java.util.Comparator;

import generic.Person;

/**
 * Membuat Comparator Interface
 */
public class ComparatorApp {
    public static void main(String[] args) {
        
        Person[] people = {
            new Person("Iqbal", "Tangerang"),
            new Person("Steven", "Tangerang"),
            new Person("garuls", "Tangerang")
        };
        
        Comparator<Person> comparator = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);

        System.out.println(Arrays.toString(people));
        
    }
}
