import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Immutable Set
 */
public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Iqbal");

        System.out.println(empty);
        System.out.println(one);

        Set<String> mutable = new HashSet<>();
        mutable.add("iqbal");
        mutable.add("suwandi");
        Set<String> immutable = Collections.unmodifiableSet(mutable);
        System.out.println(immutable);

        Set<String> set = Set.of("Iqbal", "Suwandi");
        System.out.println(set);
    }
}
