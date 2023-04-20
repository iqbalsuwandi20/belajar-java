package classes;

/**
 * Membuat method di string class
 */
public class StringApp {
    public static void main(String[] args) {

        String name = "Iqbal Suwandi";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);

        System.out.println(name.length());

        System.out.println(name.startsWith("Iqbal"));
        System.out.println(name.endsWith("Suwandi"));

        String[] names = name.split(" ");
        for(var value : names) {
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());

        System.out.println(name.charAt(3));

        char[] chars = name.toCharArray();
        System.out.println(chars);

    }
}