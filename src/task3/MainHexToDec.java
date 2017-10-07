package task3;

public class MainHexToDec {

    public static void main(String[] args) {

        String hexValue = "22E6A7";
        int decValue = HexToDec.convert(hexValue);
        System.out.println("Decimal value of " + hexValue + " is " + decValue);
        System.out.println();
        System.out.println("Or easier " + Integer.parseInt(hexValue, 16));
    }
}