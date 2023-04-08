public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai) {
            case "A":
            System.out.println("WOW, Anda Lulus dengan Baik");
            break;
            case "B":
            case "C":
            System.out.println("Nilai Anda Cukup");
            break;
            case "D":
            System.out.println("Anda Tidak Lulus");
            break;
            default:
            System.out.println("Mungkin Anda Salah Jurusan");
        }

        // Switch Lambda
        switch (nilai) {
            case "A" -> System.out.println("WOW, Anda Lulus dengan Baik");
            case "B", "C" -> System.out.println("Nilai Anda Cukup");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }

        // Yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "WOW, Anda Lulus dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Mungkin Anda Salah Jurusan";
            }
        }
        System.out.println(ucapan);

        ucapan = switch (nilai) {
            case "A":
            yield "WOW, Anda Lulus dengan Baik";
            case "B", "C":
            yield "Nilai Anda Cukup";
            case "D":
            yield "Anda Tidak Lulus";
            default:
            yield "Mungkin Anda Salah Jurusan";
        };
        System.out.println(ucapan);
        
    }

}
