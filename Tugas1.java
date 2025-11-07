import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai yang ingin diinput: ");
        int jmlNilai = sc.nextInt();

        int nilai [] = new int[jmlNilai];
        double total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }
        double avgNilai = total / nilai.length;

        int nilaiTertinggi = 0, nilaiTerendah = 100;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }

        System.out.println("-----------------------------------");
        System.out.println("      DAFTAR NILAI MAHASISWA");
        System.out.println("-----------------------------------");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
        System.out.println("-----------------------------------");
        System.out.println("Rata-rata nilai     : " + avgNilai);
        System.out.println("Nilai tertinggi     : " + nilaiTertinggi);
        System.out.println("Nilai terendah      : " + nilaiTerendah);
        sc.close();
    }
}
