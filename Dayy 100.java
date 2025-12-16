import java.util.Scanner;

public class Dayy100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // jumlah test case

        for (int i = 0; i < n; i++) {
            String teks = sc.next(); // membaca string

            int iPos = teks.indexOf('I');
            int sPos = teks.indexOf('S', iPos + 1);
            int cPos = teks.indexOf('C', sPos + 1);

            if (iPos != -1 && sPos != -1 && cPos != -1) {
                System.out.println("CANTIK");
            } else {
                System.out.println("TIDAK CANTIK");
            }
        }

        sc.close();
    }
}
