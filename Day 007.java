public class day007 {

    public static void main(String[] args) {
        char grade = 'A';
      
        boolean lulus = true;
      
        int nilai = 75;
        boolean statusKelulusan = nilai >= 60;

        System.out.println("Nilai Ujian     : " + grade);
        System.out.println("Lulus (manual)  : " + lulus);
        System.out.println("Nilai Angka     : " + nilai);
        System.out.println("Lulus (logika)  : " + statusKelulusan);
    }
}
