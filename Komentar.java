public class Komentar {
    public static void main(String[] args) {
        System.out.println(sum(30, 90));
    }

    // Komentar Multiline
    /*
     * test 1
     * test 2
     * test 3
     */
    
     // Komentar Dokumentasi
     /**
      * Method untuk menjumlahkan value1 dan value2
      * @param value1 angka pertama
      * @param value2 angka kedua
      * @return hasil penjumlahan value1 dan value2
      */
    static int sum(int value1, int value2) {
        // Komentar satu baris (tambah value1 dan value2)
        return value1 + value2;
    }
}
