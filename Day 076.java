public class Day076 {
    public static void main(String[] args) {
        String kata1 = "Hello";
        String kata2 = "hello";
        String kalimat = "Belajar Java sangat menyenangkan";
        String kata3 = "";

        System.out.println("equals(): " + kata1.equals(kata2));
      
        System.out.println("equalsIgnoreCase(): " + kata1.equalsIgnoreCase(kata2));
      
        System.out.println("contains(\"Java\"): " + kalimat.contains("Java"));
      
        System.out.println("isEmpty(): " + kata3.isEmpty());
    }
}
