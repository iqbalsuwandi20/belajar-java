package belajarjavapack.application;

import belajarjavapack.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        
        // Cara mengakses record class
        LoginRequest loginRequest = new LoginRequest("iqbal", "rahasia");
        
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());
        System.out.println(loginRequest);

        // Cara mengakses record class constructor
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("iqbal"));
        System.out.println(new LoginRequest("iqbal", "rahasia"));
        
    }

}
