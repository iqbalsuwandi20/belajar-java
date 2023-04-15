package belajarjavapack.data;

// Cara membuat final class 
public class SocialMedia {
    String name;   
}

final class Facebook extends SocialMedia {
    // Cara membuat final method
    final void login(String username, String password) {
        // isi method
    }
}

// class FakeFacebook extends Facebook { ERROR
    // void login(String username, String password) {
    //     // isi method
    // }
    // ERROR
// } 