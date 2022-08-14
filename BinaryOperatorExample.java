public class BinaryOperatorExample {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;

        // Multiplicative (* / %) operations are evaluated first
        // Before Additive operators (+ -)
        // and evaluated left to right.

        // Could also be written:  a + (e * b) - (f / c) % b;
        int result = a + e * b - f / c % b;
        System.out.println("result for (a + e * b - f / c % b) = "
                + result);
    }
}
