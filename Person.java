class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // Cara membuat constructor
    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    // Cara membuat method
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}