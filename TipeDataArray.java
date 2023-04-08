public class TipeDataArray {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[2];

        stringArray[0] = "Iqbal";
        stringArray[1] = "Suwandi";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);

        stringArray[0] = "Steven";
        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[1];

        // Array Initializer
        String[] namaNama = {
            "iqbal", "suwandi"
        };

        int[] arrayInt = new int[] {
            1,2,3,4,5
        };

        // Operasi di Array
        System.out.println(arrayInt.length);
        arrayInt[0] = 10;
        namaNama[0] = "Steven";

        // Array di dalam Array
        String[][] members = {
            {"iqbal", "suwandi"},
            {"steven", "garul"},
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
