// Cara membuat Polymorphism
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        // Cara membuat method overriding
        System.out.println("Hi " + name + ", My Name is Employee" + this.name);
    }
}