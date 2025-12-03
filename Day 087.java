import java.util.Scanner;

public class Day087 {
    public static void main(String[] args) {

        int[] angka = {5, 12, 7, 20, 30};

        Scanner input = new Scanner(System.in);
        System.out.print("angka yang ingin dicari: ");
        int cari = input.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Angka " + cari + " ditemukan di dalam array.");
        } else {
            System.out.println("Angka " + cari + " TIDAK ditemukan di dalam array.");
        }

        input.close();
    }
}
