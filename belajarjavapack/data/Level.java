package belajarjavapack.data;

// Cara membuat enum class
public enum Level {

    // Cara membuat members enum
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    // Cara membuat members enum
    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
