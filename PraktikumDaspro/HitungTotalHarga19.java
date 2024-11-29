import java.util.Scanner;

public class HitungTotalHarga19 {

    // Fungsi untuk menghitung total harga berdasarkan pilihan menu dan jumlah item
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        // Cek kode promo
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5; // Diskon 50%
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7; // Diskon 30%
        } else if (!kodePromo.equalsIgnoreCase("NO_PROMO")) {
            System.out.println("Kode promo tidak valid. Tidak ada diskon yang diberikan.");
        }

        return hargaTotal;
    }

    // Fungsi untuk mencetak ucapan
    public static void penerimaUcapan() {
        System.out.println("\nTerima kasih telah memesan di restoran kami!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menampilkan menu
        System.out.println("=== Menu Restoran ===");
        System.out.println("1. Ayam Goreng  - Rp15,000");
        System.out.println("2. Nasi Goreng  - Rp20,000");
        System.out.println("3. Sate Ayam    - Rp22,000");
        System.out.println("4. Mie Goreng   - Rp12,000");
        System.out.println("5. Teh Manis    - Rp10,000");
        System.out.println("6. Kopi Susu    - Rp18,000");

        int totalKeseluruhan = 0; // Menyimpan total keseluruhan
        String kodePromo;

        // Input kode promo
        System.out.print("\nMasukkan kode promo (atau masukkan NO_PROMO jika tidak ada): ");
        kodePromo = sc.nextLine();

        // Loop untuk memesan beberapa jenis menu
        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) { // Keluar dari loop jika input 0
                break;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            // Hitung harga untuk menu yang dipilih
            int totalHargaMenu = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHargaMenu;

            System.out.println("Total harga untuk menu ini: Rp" + totalHargaMenu);
        }

        // Menampilkan total keseluruhan
        System.out.println("\nTotal keseluruhan untuk semua pesanan Anda: Rp" + totalKeseluruhan);

        // Menampilkan ucapan terima kasih
        penerimaUcapan();
    }
}
