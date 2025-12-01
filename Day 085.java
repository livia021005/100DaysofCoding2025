public class Day085 {
    public static void main(String[] args) {

        int[] angka = {12, 5, 30, 7, 25};  
        int maks = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > maks) {
                maks = angka[i];
            }
        }

        System.out.println("Angka maksimal dalam array adalah: " + maks);
    }
}
