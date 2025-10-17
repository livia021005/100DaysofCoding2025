import java.util.Scanner;

public class Day040 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Kalkulator Sederhana ===");
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.println("Pilih operasi (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double hasil;

        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.println("Hasil penjumlahan: " + hasil);
        } else if (operator == '-') {
            hasil = angka1 - angka2;
            System.out.println("Hasil pengurangan: " + hasil);
        } else if (operator == '*') {
            hasil = angka1 * angka2;
            System.out.println("Hasil perkalian: " + hasil);
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                System.out.println("Hasil pembagian: " + hasil);
            } else {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            }
        } else {
            System.out.println("Operator tidak dikenal!");
        }

        input.close();
    }
}
