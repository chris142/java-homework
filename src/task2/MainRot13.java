package task2;

public class MainRot13 {

    public static void main(String[] args) {
            String s = args[0];
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                c = Rot13.rotIt(c);
                System.out.print(c);
            }
            System.out.println();
    }
}
