public class Day036 {
    public static void main(String[] args) {
        int nilai = 85;

        if (nilai >= 75) {
            System.out.println("Kamu lulus.");

            if (nilai >= 90) {
                System.out.println("Nilaimu sangat baik!");
            } else {
                System.out.println("Nilaimu baik, tapi masih bisa lebih baik lagi!");
            }
        } else {
            System.out.println("Kamu belum lulus, semangat belajar lagi!");
        }
    }
}
