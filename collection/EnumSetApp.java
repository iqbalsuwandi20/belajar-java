import java.util.EnumSet;

/**
 * Set
 */
public class EnumSetApp {

    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }

    public static void main(String[] args) {

        /**
         * EnumSet
         */
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class); // mengambil data semuanya
        // EnumSet<Gender> genders2 = EnumSet.of(Gender.FEMALE, Gender.MALE, Gender.FEMALE); // mengambil data satu satu

        for (var gender : genders) {
            System.out.println(gender);
        }
    }
}
