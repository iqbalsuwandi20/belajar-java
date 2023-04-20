package classes;

/**
 * Membuat StringBuffer dan StringBuilder class
 */
public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Iqbal");
        builder.append(" ");
        builder.append("Suwandi");

        String name = builder.toString();
        System.out.println(name);
    }
}
