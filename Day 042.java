import java.util.Scanner;

public class Day042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Gaji Bersih ===");
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan tunjangan: ");
        double tunjangan = input.nextDouble();

        System.out.print("Masukkan potongan (misalnya pajak, BPJS, dll): ");
        double potongan = input.nextDouble();

        double gajiKotor = gajiPokok + tunjangan;
        double gajiBersih = gajiKotor - potongan;

        System.out.println("Gaji Kotor: " + gajiKotor);
        System.out.println("Gaji Bersih: " + gajiBersih);

        input.close();
    }
}
