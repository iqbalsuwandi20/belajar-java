public class PersonApp {
    public static void main(String[] args) {
        Person person2 = new Person();
        Person person3;
        person3 = new Person();
        person3.name = "Jakol";

        var person1 = new Person();
        person1.name = "Iqbal";
        person1.address = "Tangerang";
        // person1.country = "Belanda"; ERROR KARENA FINAL VAR
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        // Cara mengakses method
        person1.sayHello("Steven");
        person3.sayHello("Garul");
    }
}
