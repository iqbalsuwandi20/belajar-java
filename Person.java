class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // Cara membuat constructor
    // Kata kunci this
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Cara membuat constructor overloading
    Person(String paramName) {
        // Cara memanggil constructor lain
        this(paramName, null);
    }
    Person() {
        // Cara memanggil constructor lain
        this(null);
    }

    // Cara membuat method
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
}