package belajarjavapack.application;

import belajarjavapack.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

        // Cara mengakses anonymous class
        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        english.sayHello();
        english.sayHello("Iqbal");
        
    }

}
