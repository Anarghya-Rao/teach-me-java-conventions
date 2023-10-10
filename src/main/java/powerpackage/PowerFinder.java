package powerpackage;

public class PowerFinder {
    public static int power(int base, int exponent) {
        int total_product = 1;

        for (int i = 0; i<exponent; i++) {
            total_product *= base;
        }

        return total_product;
    }
}
