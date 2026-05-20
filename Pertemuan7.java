import java.util.ArrayList;
import java.util.Scanner;

// Class Member
class Member {
    String nama;
    int score;

    // Constructor
    Member(String nama, int score) {
        this.nama = nama;
        this.score = score;
    }

    // Method tampil data
    void tampilkan() {
        System.out.println("Nama  : " + nama);
        System.out.println("Score : " + score);
        System.out.println("-------------------");
    }
}

// Class utama
public class Pertemuan7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Member> daftarMember = new ArrayList<>();

        String lanjut;

        do {
            // Input data
            System.out.print("Masukkan nama : ");
            String nama = input.nextLine();

            System.out.print("Masukkan score : ");
            int score = input.nextInt();
            input.nextLine();

            // Simpan ke ArrayList
            daftarMember.add(new Member(nama, score));

            // Tanya lanjut
            System.out.print("Tambah data lagi? (y/n) : ");
            lanjut = input.nextLine();

        } while (lanjut.equalsIgnoreCase("y"));

        // Menampilkan isi ArrayList
        System.out.println("\n=== DAFTAR MEMBER ===");

        for (Member m : daftarMember) {
            m.tampilkan();
        }

        input.close();
    }
}
