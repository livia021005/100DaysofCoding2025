import java.util.Scanner;

public class Day045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka (1-5): ");
        int bulan = input.nextInt();

        switch (bulan) {
            case 1:
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Februari");
                break;
            case 3:
                System.out.println("Maret");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mei");
                break;
            default:
                System.out.println("Angka yang Anda masukkan tidak valid, masukkan angka 1-5.");
        }

        input.close();
    }
}
