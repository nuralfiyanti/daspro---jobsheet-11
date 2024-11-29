public class Kubus19 {
    // Fungsi untuk menghitung volume kubus
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi; // Volume kubus sisi^3
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi; // Luas permukaan kubus 6 * sisi^2
    }

    public static void main(String[] args) {
        // Contoh penggunaan fungsi
        int sisi = 5; // Misalnya sisi kubus adalah 5 cm
        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);
        
        // Output hasil perhitungan
        System.out.println("Volume Kubus dengan sisi " + sisi + " cm: " + volume + " cm³");
        System.out.println("Luas Permukaan Kubus dengan sisi " + sisi + " cm: " + luasPermukaan + " cm²");
    }
}
