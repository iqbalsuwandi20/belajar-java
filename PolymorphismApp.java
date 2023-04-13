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
        // Cara membuat type check dan casts
        if(employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if(employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
