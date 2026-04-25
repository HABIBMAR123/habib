public class LoopBintang2 {
    static void bintang() {
        for(int baris=1; baris<=5; baris++) {
            for(int kolom=1; kolom<=baris; kolom++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    } // akhir fungsi bintang()

    public static void main(String[] args) {
        // BAGIAN 1
        bintang();

        // BAGIAN 2
        bintang();

        // BAGIAN 3
        for(int baris=1; baris<=3; baris++) {
            for(int kolom=1; kolom<=baris; kolom++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // BAGIAN 4
        for(int baris=1; baris<=3; baris++) {
            for(int kolom=1; kolom<=baris; kolom++) {
                System.out.print("X");
            }
            System.out.println();
        }
        System.out.println();

    }
}
