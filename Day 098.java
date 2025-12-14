public class Day098 {
    public static void main(String[] args) {

        int N = 10;
        int a = 0, b = 1;

        System.out.println("Deret Fibonacci 1 sampai " + N + ":");

        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
