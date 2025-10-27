import java.util.Scanner;

public class Day050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        String hasil = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil";

        System.out.println("Hasil: " + hasil);

        input.close();
    }
}
