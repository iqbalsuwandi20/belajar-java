package belajarjavapack.util;

import belajarjavapack.data.LoginRequest;
import belajarjavapack.error.BlankException;
import belajarjavapack.error.ValidationException;

// Cara membuat exception
public class ValidationUtil {

    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {

        if(loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if(loginRequest.username().isBlank()) {
            throw new ValidationException("Username is blank");
        } else if(loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if(loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
        
    }

    // Cara membuat runtime exception
    public static void validateRuntime(LoginRequest loginRequest) {
        if(loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if(loginRequest.username().isBlank()) {
            throw new BlankException("Username is blank");
        } else if(loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if(loginRequest.password().isBlank()) {
            throw new BlankException("Password is blank");
        }

    }

}
