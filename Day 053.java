public class Day053 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            if (i == 5) {
                System.out.println("Perulangan berhenti di angka " + i);
                break;
            }
            System.out.println("Angka ke-" + i);
        }
    }
}
