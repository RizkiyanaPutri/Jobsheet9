import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jmlMenu = sc.nextInt();
        sc.nextLine();

        String[] menu = new String[jmlMenu];
        double[] harga = new double[jmlMenu];
        double totalHarga = 0;

        for (int i = 0; i < menu.length; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + " : ");
            menu[i] = sc.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + " : Rp ");
            harga[i] = sc.nextDouble();
            sc.nextLine(); 
            totalHarga += harga[i];
        }

        System.out.println("\n-------------------------------------");
        System.out.println("             STRUK PESANAN");
        System.out.println("-------------------------------------");
        for (int i = 0; i < harga.length; i++) {
            System.out.printf("%-3d %-20s Rp %,.0f\n", (i + 1), menu[i], harga[i]);
        }
        System.out.println("-------------------------------------");
        System.out.printf("%-23s Rp %,.0f\n", "Total Biaya:", totalHarga);
        System.out.println("-------------------------------------");
        System.out.println("            Terima Kasih :) ");
        System.out.println("          Selamat Menikmati! ");
        System.out.println("-------------------------------------");
        sc.close();
    }
}
