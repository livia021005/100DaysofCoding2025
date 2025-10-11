public class Day034 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 2;

        int hasilAritmatika = x + y * z;
        boolean hasilPerbandingan = hasilAritmatika > 15;
        boolean hasilLogika = hasilPerbandingan && (x > y);

        System.out.println("Hasil aritmatika: " + hasilAritmatika);
        System.out.println("Hasil perbandingan: " + hasilPerbandingan);
        System.out.println("Hasil logika akhir: " + hasilLogika);
    }
}
