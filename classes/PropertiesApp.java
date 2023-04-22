package classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Membuat Properties Class
 */
public class PropertiesApp {
    public static void main(String[] args) {
        
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String hostString = properties.getProperty("database.host");
            String portString = properties.getProperty("database.port");
            String usernameString = properties.getProperty("database.username");
            String passwordString = properties.getProperty("database.password");

            System.out.println(hostString);
            System.out.println(portString);
            System.out.println(usernameString);
            System.out.println(passwordString);

        } catch (FileNotFoundException exception) {
            System.out.println("File tidak ketemu");
        } catch (IOException exception) {
            System.out.println("Gagal load data dari file");
        }

        try {
            Properties properties = new Properties();
            properties.put("name.first", "Iqbal");
            properties.put("name.last", "Suwandi");

            properties.store(new FileOutputStream("name.properties"), "Konfigurasi Name");

        } catch (FileNotFoundException exception) {
            System.out.println("Error membuat file properties");
        } catch (IOException exception) {
            System.out.println("Error membuat file properties");
        }

    }
}
