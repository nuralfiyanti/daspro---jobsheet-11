import java.util.Scanner;

public class Tugas2 {
    static int [][]data = new int [5][7];
    static String []menu = {"kopi", "teh", "es degan", "roti bakar", "gorengan"};
    static String []hari = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};

    public static void main(String[] args) {
        input();
        print();
        penjualantertinggi();
        ratarata();
        
    }
    static void input(){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("masukkan menu (kopi, teh, es degan, roti bakar, gorengan): ");
        // String menu = sc.nextLine();
        // int idxmenu = -1;
        // if (menu.equalsIgnoreCase("kopi")) {
        //     idxmenu = 0;
        // }else if (menu.equalsIgnoreCase("teh")) {
        //     idxmenu = 1;
        // }else if (menu.equalsIgnoreCase("es degan")) {
        //     idxmenu = 2;
        // }else if (menu.equalsIgnoreCase("roti bakar")) {
        //     idxmenu = 3;
        // }else if (menu.equalsIgnoreCase("gorengan")) {
        //     idxmenu = 4;
        // }
        // System.out.print("masukkan hari (senin - minggu): ");
        // String hari = sc.nextLine();
        // int idxHari = -1;
        // if (hari.equalsIgnoreCase("senin")) {
        //     idxHari = 0;
        // }else if (hari.equalsIgnoreCase("selasa")) {
        //     idxHari = 1;
        // }else if (hari.equalsIgnoreCase("rabu")) {
        //     idxHari = 2;
        // }else if (hari.equalsIgnoreCase("kamis")) {
        //     idxHari = 3;
        // }else if (hari.equalsIgnoreCase("jumat")) {
        //     idxHari = 4;
        // }else if (hari.equalsIgnoreCase("sabtu")) {
        //     idxHari = 5;
        // }else if (hari.equalsIgnoreCase("minggu")) {
        //     idxHari = 6;
        // }

        Scanner sc2 = new Scanner(System.in);
        //System.out.print("Input transaksi: " + menu + "pada hari " + hari);
        //data [idxmenu][idxHari] = sc2.nextInt();

        for(int i = 0; i < data.length; i++){
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Transaksi menu " + menu[i] + " pada hari " + hari[j] + " : ");
                data[i][j] = sc2.nextInt();
            }

        }
    }
    static void print(){
        for (int i = 0; i < data.length; i++) {
            System.out.print(menu[i] + "\t\t\t");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t ");
            }
            System.out.println("");
        }
    }
    static void penjualantertinggi(){
        int max = data[0][0];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > max) {
                    max = data[i][j];
                }
            }
            System.out.println("Penjualan tertinggi menu " + menu[i] + " = " + max);
        }
    }
    static void ratarata(){
        int total = data [0][0];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
        }
        System.out.println("Rata-rata penjualan = " + total / (data.length * data[0].length));
    }
}