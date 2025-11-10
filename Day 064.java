import java.util.Scanner;

public class Day064 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("nilai M: ");
        int M = input.nextInt();

        System.out.print("nilai N: ");
        int N = input.nextInt();

        int hasil = 1;

        for (int i = 1; i <= N; i++) {
            hasil = hasil * M;
        }

        System.out.println(hasil);

        input.close();
    }
}
