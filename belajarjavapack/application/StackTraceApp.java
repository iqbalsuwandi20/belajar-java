package belajarjavapack.application;

// Cara membuat stack trace element class
public class StackTraceApp {
    public static void main(String[] args) {
        

        // Cara mengakses multiple stack trace element class
        try {
            sampleError();
        } catch(RuntimeException exception) {
            exception.printStackTrace();
        }
        
        try {
            String[] names = {
                "Iqbal", "Suwandi", "Steven"
            };

            System.out.println(names[100]);

        } catch (Throwable throwable) {
            StackTraceElement[] stackTraceElements = throwable.getStackTrace();

            throwable.printStackTrace();

        }

    }

    // Multiple stack trace element class
    public static void sampleError() {

        try {
            String[] names = {
                "Iqbal", "Suwandi", "Steven"
            };

            System.out.println(names[100]);

        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }

    }
    
}