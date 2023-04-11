public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialRecursive(10));

        loop(10_000);
    }

    static int factorialRecursive(int value) {
        if(value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value -1);
        }
    }

    // Error StackOverflow
    static void loop(int value) {
        if(value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }

}
