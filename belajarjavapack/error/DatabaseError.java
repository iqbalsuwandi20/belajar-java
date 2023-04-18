package belajarjavapack.error;

// Cara membuat error
// Cara membuat predefined annotation
@Deprecated
public class DatabaseError extends Error {

    public DatabaseError(String message) {
        super(message);
    }

    // Cara membuat predefined annotation
    @Override
    public String getMessage() {
        return super.getMessage();
    }

}