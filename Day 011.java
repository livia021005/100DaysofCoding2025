import java.util.Scanner;

public class day011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();

        System.out.println("--------------------------");
        System.out.println("Halo " + nama + ", umur kamu " + umur + " tahun.");

        input.close();
    }
}
