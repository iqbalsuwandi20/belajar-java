package belajarjavapack.application;

import belajarjavapack.data.Category;

// Cara mengakses getter dan setter
public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
        category.setId("ID");
        category.setId(null);
        
        System.out.println(category.getId());
    }
}
