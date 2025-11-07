import java.util.Scanner;

public class Day061 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("nilai N: ");
        int N = input.nextInt();

        System.out.print("nilai M: ");
        int M = input.nextInt();

        System.out.println("\nBilangan kelipatan " + M + " dari 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}
