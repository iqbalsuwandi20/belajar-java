// Cara membuat inheritance
class VicePresident extends Manager{
    void sayHello(String name) {
        // Cara membuat method overriding
        System.out.println("Hi " + name + ", My Name is Vice President" + this.name);
    }
}
