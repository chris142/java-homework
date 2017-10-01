public class GCD {

    public static void log(int s) {
        System.out.println(s);
    }

    public static int rem(int a, int b) {
        int ans = Math.abs(a) - Math.abs(Math.floorDiv(a, b)) * b;
        log(ans);
        return ans;
    }

    public static int gcdFirst(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int gcdSecond(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = Math.floorMod(a, b);
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int gcdThird(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = rem(a, b);
            a = b;
            b = tmp;
        }
        return a;
    }
}
