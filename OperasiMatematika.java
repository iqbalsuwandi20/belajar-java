public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 30;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augemented Assignments
        int c = 300;

        c+= 20;
        System.out.println(c);

        c-= 20;
        System.out.println(c);

        c*= 20;
        System.out.println(c);

        c/= 20;
        System.out.println(c);

        c%= 20;
        System.out.println(c);

        // Unary Operator
        int d = 100;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);
    }
}
