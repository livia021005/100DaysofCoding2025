import java.util.Scanner;

public class Day044 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();

        if (nilai >= 85) {
            System.out.println("A");
        } else if (nilai >= 70) {
            System.out.println("B");
        } else if (nilai >= 55) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        input.close();
    }
}
