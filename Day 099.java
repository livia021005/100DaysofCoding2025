public class Day099 {
    public static void main(String[] args) {

        int N = 20;

        System.out.println("Bilangan prima dari 1 sampai " + N + ":");

        for (int i = 2; i <= N; i++) {
            boolean prima = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.print(i + " ");
            }
        }
    }
}
