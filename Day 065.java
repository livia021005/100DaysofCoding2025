import java.util.Scanner;

public class Day065 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int N = input.nextInt();

        int faktorial = 1;

        for (int i = 1; i <= N; i++) {
            faktorial = faktorial * i;
        }

        System.out.println(faktorial);

        input.close();
    }
}
