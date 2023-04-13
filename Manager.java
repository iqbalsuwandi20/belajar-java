// Cara membuat Polymorphism
class Manager extends Employee{
    String company;

    // Cara membuat super constructor
    Manager(String name) {
        super(name);
    }
    Manager(String name, String company) {
        super(name);
        this.company = company;
    }
    
    void sayHello(String name) {
        // Cara membuat method overriding
        System.out.println("Hi " + name + ", My Name is Manager" + this.name);
    }
}
