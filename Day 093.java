public class Day093 {
    public static void main(String[] args) {

        double angka = 7.4;

        double ceilValue = Math.ceil(angka);
        double floorValue = Math.floor(angka);
        long roundValue = Math.round(angka);

        System.out.println("Angka asli : " + angka);
        System.out.println("ceil()  : " + ceilValue);
        System.out.println("floor() : " + floorValue);
        System.out.println("round() : " + roundValue);
    }
}
