public class PengunjungCafe19 {

    public static void main(String[] args) {
        // Eksekusi fungsi daftarPengunjung dari dalam main
        daftarPengunjung("Ali", "Budi", "Citra");
    }
    // Fungsi daftar pengunjung menggunakan parameter varArgs
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String pengunjung : namaPengunjung) {
            System.out.println("- " + pengunjung);
        }
    }
}
