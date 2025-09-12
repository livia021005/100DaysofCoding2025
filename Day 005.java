public class day005 {

    public static void main(String[] args) {
        // byte: angka kecil (-128 s/d 127)
        byte umur = 19;

        // short: angka agak besar (-32.768 s/d 32.767)
        short tahun = 2025;

        // int: angka umum dipakai (maksimal sekitar 2 milyar)
        int tinggi = 162;

        // long: angka sangat besar (tambah L di akhir angka)
        long populasi = 7800000000L;

        // menampilkan hasil
        System.out.println("Umur (byte)     : " + umur);
        System.out.println("Tahun (short)   : " + tahun);
        System.out.println("Tinggi (int)    : " + tinggi + " cm");
        System.out.println("Populasi (long) : " + populasi);
    }
}
