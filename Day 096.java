public class Day096 {

    static int tambah(int a, int b) {
        return a + b;
    }

    static int kurang(int a, int b) {
        return a - b;
    }

    static int kali(int a, int b) {
        return a * b;
    }
  
    static double bagi(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        int x = 10;
        int y = 2;

        System.out.println("Hasil Penjumlahan: " + tambah(x, y));
        System.out.println("Hasil Pengurangan: " + kurang(x, y));
        System.out.println("Hasil Perkalian  : " + kali(x, y));
        System.out.println("Hasil Pembagian  : " + bagi(x, y));
    }
}
