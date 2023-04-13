class Manager {
    String name;
    String company;

    // Cara membuat super constructor
    Manager(String name) {
        this.name = name;
    }
    Manager(String name, String company) {
        this.name = name;
        this.company = company;
    }
    
    void sayHello(String name) {
        // Cara membuat method overriding
        System.out.println("Hi " + name + ", My Name is Manager" + this.name);
    }
}
