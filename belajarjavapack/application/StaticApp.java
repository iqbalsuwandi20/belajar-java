package belajarjavapack.application;

// Cara membuat static import
import static belajarjavapack.data.Application.PROCESSORS;
import static belajarjavapack.data.Constant.*;
import belajarjavapack.data.Country;
import belajarjavapack.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        // Cara mengakses static keyword
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
            MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Tangerang");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);

    }

}
