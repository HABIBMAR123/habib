import java.util.Scanner;

public class pos1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data barang
        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine();

        System.out.print("Masukkan jumlah (qty): ");
        int qty = input.nextInt();

        System.out.print("Masukkan harga per barang: ");
        double harga = input.nextDouble();

        // Hitung total
        double total = qty * harga;

        // Diskon jika qty > 10
        if (qty > 10) {
            total *= 0.95; // diskon 5%
            System.out.println("Diskon 5% diberikan karena qty > 10");
        }

        System.out.println("Total pembayaran untuk " + namaBarang + " adalah: Rp " + total);
    }
}