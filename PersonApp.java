public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        person1.name = "Iqbal";
        person1.address = "Tangerang";
        // person1.country = "Belanda"; ERROR KARENA FINAL VAR
        
        Person person2 = new Person();
        Person person3;
        person3 = new Person();
    }
}
