public class MethodReturnValue {
    public static void main(String[] args) {
        var result1 = sum(100, 200);
        System.out.println(result1);

        System.out.println(sum(300, 500));

        System.out.println(hitung(300, "+", 300));
        System.out.println(hitung(20, "-", 30));
        System.out.println(hitung(300, "salah", 300));
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    // Return Percabangan
    static int hitung(int value1, String operasi, int value2) {
        switch(operasi) {
            case "+" :
                return value1 + value2;
            case "-" :
                return value1 - value2;
            default:
                return 0;
        }
    }
}