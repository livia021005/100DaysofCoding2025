public class Day083 {
    public static void main(String[] args) {

        int[] angka = {5, 10, 15, 20, 25}; // Array berisi 5 angka
        int total = 0;
      
        for (int i = 0; i < angka.length; i++) {
            total = total + angka[i];
        }

        System.out.println("Total jumlah elemen array = " + total);
    }
}
