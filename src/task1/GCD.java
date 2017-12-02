package task1;

class GCD {


    private static int rem(int a, int b) {

        if (b < 0) {
            return rem(a, -b);
        }
        if (a < 0) {
            return rem(-a, b);
        }
        while (a >= b) {
            a = a - b;
        }
        return a;
    }

    static int gcdFirst(int a, int b) {

        while (a != 0 && b != 0) {
            if (Math.abs(a) > Math.abs(b)) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a | b;
    }

    static int gcdSecond(int a, int b) {

        while (a != 0 && b != 0) {
            if (Math.abs(a) > Math.abs(b)) {
                a = Math.floorMod(a, b);
            } else {
                b = Math.floorMod(b, a);
            }
        }
        return a | b;
    }

    static int gcdThird(int a, int b) {
        while (a != 0 && b != 0) {
            if (Math.abs(a) > Math.abs(b)) {
                a = rem(a, b);
            } else {
                b = rem(b, a);
            }
        }
        return a | b;
    }
}