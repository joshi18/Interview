package src.DSA.Recursion;

public class NQueens {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(5));

    }

    public static int trailingZeroes(int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int p = n * trailingZeroes(n - 1);
        int count = 0;
        int o = lastZeros(p, count);
        return o;

    }

    public static int lastZeros(int p, int count) {
        if (p % 10 != 0 || p == 0) {
            return count;
        }
        if (p < 10) {
            return 0;
        }
        p = p / 10;
        count += 1;
        return lastZeros(p, count);
    }
}
