public class Day076 {
    public static void main(String[] args) {
        String kalimat = "  Belajar Pemrograman Java  ";

        String potong = kalimat.substring(2, 10); 
        String ganti = kalimat.replace("Java", "Python"); 
        String rapih = kalimat.trim(); 

        System.out.println("Hasil substring: " + potong);
        System.out.println("Hasil replace: " + ganti);
        System.out.println("Hasil trim: " + rapih);
    }
}
