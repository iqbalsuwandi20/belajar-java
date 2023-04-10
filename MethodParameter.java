public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Iqbal", "Suwandi");
        sayHello("Steven", "Garuls");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}