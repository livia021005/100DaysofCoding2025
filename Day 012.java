import java.util.Scanner;

public class day012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Biodata Sederhana ===");

        System.out.print("Masukkan Nama     : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM      : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Umur     : ");
        int umur = input.nextInt();

        System.out.print("Masukkan Tinggi   : ");
        double tinggi = input.nextDouble();

        System.out.println("\n=== Data Biodata ===");
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Tinggi : " + tinggi + " cm");

        input.close();
    }
}
