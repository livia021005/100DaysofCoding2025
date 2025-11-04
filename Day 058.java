public class Day058 {
    public static void main(String[] args) {
        int N = 5;

        System.out.println("Angka 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nAngka " + N + " sampai 1:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
