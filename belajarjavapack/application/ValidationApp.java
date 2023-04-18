package belajarjavapack.application;

import belajarjavapack.data.LoginRequest;
import belajarjavapack.error.ValidationException;
import belajarjavapack.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        
        // Cara mengakses exception
        LoginRequest loginRequest = new LoginRequest(null, null);

        // Cara mengakses try catch
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        // Multiple try catch (2)
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        // Kata kunci finally
        } finally {
            System.out.println("Selalu di eksekusi");
        }

    }

}
