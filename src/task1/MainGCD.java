package task1;

public class MainGCD {

    public static void main(String[] args) {

        int a = 18;
        int b = 150;

        System.out.println("for               " + a + ", " + b);
        System.out.println("gcdFirst        \t" + GCD.gcdFirst(a, b));
        System.out.println("gcdSecond       \t" + GCD.gcdSecond(a, b));
        System.out.println("gcdThird        \t" + GCD.gcdThird(a, b));

        System.out.println("\nfor             " + (-a) + ", " + b);
        System.out.println("gcdFirst        \t" + GCD.gcdFirst(-a, b));
        System.out.println("gcdFloorMod     \t" + GCD.gcdSecond(-a, b));
        System.out.println("gcdThird        \t" + GCD.gcdThird(-a, b));

        System.out.println("\nfor             " + a + ", " + (-b));
        System.out.println("gcdFirst        \t" + GCD.gcdFirst(a, -b));
        System.out.println("gcdSecond       \t" + GCD.gcdSecond(a, -b));
        System.out.println("gcdThird        \t" + GCD.gcdThird(a, -b));

        System.out.println("\nfor             " + (-a) + ", " + (-b));
        System.out.println("gcdFirst        \t" + GCD.gcdFirst(-a, -b));
        System.out.println("gcdSecond       \t" + GCD.gcdSecond(-a, -b));
        System.out.println("gcdThird        \t" + GCD.gcdThird(-a, -b));
    }
}
