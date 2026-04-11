import java.util.Scanner;

public class pos2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine().toLowerCase(); // biar huruf besar/kecil aman

        System.out.print("Masukkan jumlah (qty): ");
        int qty = input.nextInt();

        double harga;
        double total;

        // Tentukan harga
        if (namaBarang.equals("pensil")) {
            harga = 3000;
        } else if (namaBarang.equals("pen")) {
            harga = 5000;
        } else {
            System.out.println("Barang tidak dikenal");
            return; // keluar program
        }

        total = harga * qty;

        // Diskon hanya untuk pensil
        if (namaBarang.equals("pensil") && qty > 10) {
            total *= 0.95;
            System.out.println("Diskon 5% diberikan karena pensil qty > 10");
        }

        System.out.println("Total pembayaran untuk " + namaBarang + " adalah: Rp " + total);
    }
}