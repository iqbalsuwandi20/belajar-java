package belajarjavapack.data;

// Cara membuat record class
public record LoginRequest(String username, String password) {

    // Cara membuat record class constructor
    public LoginRequest {
        System.out.println("Membuat object LoginRequest");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

}
