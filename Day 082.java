import java.util.Scanner;

public class Day082 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];
      
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("\nIsi Array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Index " + i + " = " + angka[i]);
        }

        input.close();
    }
}
