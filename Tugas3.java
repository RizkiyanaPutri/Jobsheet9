import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Seblak original", "Seblak pedas biasa", "Seblak pedas banget", 
                         "Es teler", "Es buah", "Es teh", "Air mineral"};
        int[] harga = {12000, 15000, 18000, 12000, 12000, 5000, 5000};

        System.out.println("=== Daftar Menu Kafe ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-20s Rp %,d%n", (i + 1), menu[i], harga[i]);
        }

        System.out.print("\nHai, Mau pesan apa? ketik lengkap nama menunya ya!: ");
        String cari = sc.nextLine();

        boolean key = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                 System.out.printf("%s tersedia di menu dengan harga Rp %,d :)%n", menu[i], harga[i]);
                key = true;
                break;
            }
        }
        if (!key) {
            System.out.println("Maaf, " + cari + " tidak ada di menu kami:(");
        }
        sc.close();
    }
}
