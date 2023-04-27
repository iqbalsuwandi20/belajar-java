package lambda.app;

import java.util.function.Supplier;

/**
 * Lambda sebagai Lazy Parameter
 */
public class LazyApp {
    public static void main(String[] args) {
        testScore(70, () -> getName());
    }

    public static void testScore(int score, Supplier<String> name) {
        if (score > 80) {
            System.out.println("Selamat " + name.get() + ", Anda Lulus");
        } else {
            System.out.println("Coba lagi Tahun Depan");
        }
    }

    public static String getName() {
        System.out.println("Method getName() di panggil");
        return "Iqbal";
    }
}
