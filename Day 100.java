public class Day100 {

    static int[] arrayBaru;

    static int retas(int[] arr) {
        int n = arr.length;
        arrayBaru = new int[n];

        for (int i = 0; i < n; i++) {
            arrayBaru[i] = -1;
        }

        int p = 0;

        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;

            while (arrayBaru[index] != -1) {
                index = (index + 1) % n;
                p++;
            }

            arrayBaru[index] = arr[i];
        }

        return p;
    }

    static String susunKode(int p) {
        String kode = "";

        for (int i = 0; i < p && i < arrayBaru.length; i++) {
            kode += arrayBaru[i];
        }

        return kode;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int p = retas(arr);
        String kode = susunKode(p);

        System.out.println("Total pergeseran: " + p);
        System.out.println("Kode sandi: " + kode);
    }
}
