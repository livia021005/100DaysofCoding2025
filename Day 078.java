public class Day078 {
    public static void main(String[] args) {
        String teks = "  Belajar Java itu Seru  ";

        String panjang = teks + " (Panjang: " + teks.length() + ")";
        String besar = teks.toUpperCase();
        String kecil = teks.toLowerCase();
        String rapih = teks.trim();
        String potong = teks.substring(2, 9);
        String ganti = teks.replace("Seru", "Mudah");
        boolean adaJava = teks.contains("Java");

        System.out.println(panjang);
        System.out.println(besar);
        System.out.println(kecil);
        System.out.println("Trim: " + rapih);
        System.out.println("Substring: " + potong);
        System.out.println("Replace: " + ganti);
        System.out.println("Mengandung kata 'Java'? " + adaJava);
    }
}
