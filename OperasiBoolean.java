public class OperasiBoolean {
    public static void main(String[] args) {
       
        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);

        // || (OR)
        var absen2 = 70;
        var nilaiAkhir2 = 80;

        var lulusAbsen2 = absen >= 75;
        var lulusNilaiAkhir2 = nilaiAkhir >= 75;

        var lulus2 = lulusAbsen2 || lulusNilaiAkhir2;
        System.out.println(lulus2);
    }
}
