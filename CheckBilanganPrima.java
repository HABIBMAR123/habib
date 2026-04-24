public class CheckBilanganPrima {

    public static boolean bilanganPrima(int angka) {
        if (angka <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(bilanganPrima(2));   // true
        System.out.println(bilanganPrima(3));   // true
        System.out.println(bilanganPrima(4));   // false
        System.out.println(bilanganPrima(17));  // true
        System.out.println(bilanganPrima(18));  // false
    }
}
