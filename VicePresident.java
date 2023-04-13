// Cara membuat inheritance
class VicePresident extends Manager{
    // Cara membuat super constructor
    VicePresident(String name) {
        super(name);
    }
    void sayHello(String name) {
        // Cara membuat method overriding
        System.out.println("Hi " + name + ", My Name is Vice President" + this.name);
    }
}
