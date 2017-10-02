public class GCD {

    private static int rem(int a, int b) {
        return a - Math.floorDiv(a, b) * b;
    }

    public static int gcdFirst(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int gcdSecond(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int tmp;
        while (b != 0) {
            tmp = Math.floorMod(a, b);
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int gcdThird(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int tmp;
        while (b != 0) {
            tmp = rem(a, b);
            a = b;
            b = tmp;
        }
        return a;
    }
}
