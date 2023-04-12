class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // Cara membuat method
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}