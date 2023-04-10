public class ForEach {
    public static void main(String[] args) {
        // Tanpa For Each
        String[] names = {
            "Iqbal", "Suwandi",
            "Steve", "Garul"
        };
        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // For Each
        String[] array = {
            "Iqbal", "Suwandi",
            "Steve", "Garul"
        };
        for (var value : array) {
            System.out.println(value);
        }
    }
}
