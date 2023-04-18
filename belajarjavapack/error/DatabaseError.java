package belajarjavapack.error;

// Cara membuat error
public class DatabaseError extends Error {

    public DatabaseError(String message) {
        super(message);
    }

}