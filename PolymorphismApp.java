public class PolymorphismApp {
    public static void main(String[] args) {
        // Cara mengakses polymorphism
        Employee employee = new Employee("Iqbal");
        employee.sayHello("Budi");

        employee = new Manager("Seteven");
        employee.sayHello("Suwandi");

        employee = new VicePresident("Garul");
        employee.sayHello("Ciang");

        // Cara mengakses method polymorphism
        sayHello(new Employee("Tevi"));
        sayHello(new Manager("Tuva"));
        sayHello(new VicePresident("Gira"));
    }

    // Cara mengakses method polymorphism
    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
