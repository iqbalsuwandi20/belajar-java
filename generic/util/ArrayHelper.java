package generic.util;

/**
 * Membuat Generic Method
 */
public class ArrayHelper {
    
    public static <T> int count(T[] array) {
        return array.length;
    }

}
