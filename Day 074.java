import java.util.Scanner;

public class Day074 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Say Hello");
            System.out.println("2. Tampilkan Angka 1-5");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Hello, Oliv!\n");
                    break;
                case 2:
                    System.out.println("1 2 3 4 5\n");
                    break;
                case 3:
                    System.out.println("Program selesai...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!\n");
            }

        } while (pilihan != 3);

        input.close();
    }
}
