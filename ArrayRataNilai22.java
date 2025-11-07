import java.util.Scanner;
public class ArrayRataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        int jmlLulus = 0, jmlTidakLulus = 0;
        double totalLulus = 0, totalTidakLulus = 0;
        double avgNilaiLulus, avgNilaiTidakLulus;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {  
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            }else if (nilaiMhs[i] <= 70 ) {
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }
        }

        avgNilaiLulus = totalLulus / jmlLulus;
        avgNilaiTidakLulus = totalTidakLulus / jmlTidakLulus;
        System.out.println("Rata-rata nilai lulus = "+avgNilaiLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+avgNilaiTidakLulus);
        sc.close();
    }
}
