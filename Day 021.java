public class Day023 {
    public static void main(String[] args) {
        int a = 2;
        int b = 11;

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nSesudah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
