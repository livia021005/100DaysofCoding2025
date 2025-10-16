import java.util.Scanner;

public class Day038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Menu Makanan ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Sate Ayam");
        System.out.print("Pilih menu (1-3): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Kamu memilih Nasi Goreng.");
        } else if (pilihan == 2) {
            System.out.println("Kamu memilih Mie Goreng.");
        } else if (pilihan == 3) {
            System.out.println("Kamu memilih Sate Ayam.");
        } else {
            System.out.println("Pilihan tidak tersedia.");
        }

        input.close();
    }
}
