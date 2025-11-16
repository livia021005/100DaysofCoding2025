public class Day070 {
    public static void main(String[] args) {
        int baris = 3; 
        int kolom = 6; 

        for (int i = 1; i <= baris; i++) {   
            for (int j = 1; j <= kolom; j++) {  
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
