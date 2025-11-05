public class Day059 {
    public static void main(String[] args) {
        int N = 20;

        System.out.println("Angka ganjil dari 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nAngka genap dari 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
