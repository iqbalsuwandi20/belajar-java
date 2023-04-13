public class PersonApp {
    public static void main(String[] args) {
        Person person2 = new Person("Steven", "Malang");
        Person person3;
        person3 = new Person("Garul", "Sumatra");

        // Cara mengakses constructor
        var person1 = new Person("Iqbal", "Tangerang");
        // person1.country = "Belanda"; ERROR KARENA FINAL VAR
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        // Cara mengakses method
        person1.sayHello("Steven");
        person3.sayHello("Garul");
    }
}
