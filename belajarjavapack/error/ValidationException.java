package belajarjavapack.error;

// Cara membuat exception
public class ValidationException extends Throwable {

    public ValidationException(String message) {
        super(message);
    }
    
}
