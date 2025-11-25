import java.util.Scanner;

public class Day079 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String usernameBenar = "oliv";
        String passwordBenar = "12345";

        String user, pass;

        while (true) {
            System.out.print("Masukkan Username: ");
            user = input.nextLine();

            System.out.print("Masukkan Password: ");
            pass = input.nextLine();

            if (user.equals(usernameBenar) && pass.equals(passwordBenar)) {
                System.out.println("Login Berhasil! Selamat datang, " + usernameBenar + "!");
                break;
            } else {
                System.out.println("Username atau Password salah! Coba lagi.\n");
            }
        }

        input.close();
    }
}
