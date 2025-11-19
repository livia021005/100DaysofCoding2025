import java.util.Scanner;

public class Day073 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah = 0;
        int angka;

        while (true) {
            System.out.print("angka: ");
            angka = input.nextInt();

            if (angka < 0) {
                break;
            }

            jumlah += angka;
        }

        System.out.println("Total: " + jumlah);

        input.close();
    }
}
