package belajarjavapack.application;

import belajarjavapack.error.DatabaseError;

public class DatabaseApp {
    // Cara mengakses error
    public static void main(String[] args) {
        
        connectDatabase("Iqbal", null);
        System.out.println("SUCCESS");
        
    }

    public static void connectDatabase(String username, String password) {
        
        if(username == null || password == null) {
            throw new DatabaseError("Tidak bisa connect ke database");
        }

    }

}