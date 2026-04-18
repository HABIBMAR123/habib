import java.util.Scanner;  
  
public class ProgramBarang {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
  
        // Input data  
        System.out.print("Masukkan Nama Barang: ");  
        String namaBarang = input.nextLine();  
  
        System.out.print("Masukkan Quantity: ");  
        int qty = input.nextInt();  
  
        System.out.print("Masukkan Harga: ");  
        double harga = input.nextDouble();  
  
        // Hitung total  
        double total = qty * harga;  
        double diskon = 0;  
  
        // Cek diskon  
        if (qty > 10) {  
            diskon = total * 0.05;  
        }  
  
        double totalBayar = total - diskon;  
  
        // Output  
        System.out.println("\n=== STRUK PEMBELIAN ===");  
        System.out.println("Nama Barang : " + namaBarang);  
        System.out.println("Quantity    : " + qty);  
        System.out.println("Harga       : " + harga);  
        System.out.println("Total       : " + total);  
        System.out.println("Diskon      : " + diskon);  
        System.out.println("Total Bayar : " + totalBayar);  
  
        input.close();  
    }  
}  
