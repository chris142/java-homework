
class HexToDec {

    private static final String HEX_CHARACTERS = "0123456789ABCDEF";

    static int convert(String s) {
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = HEX_CHARACTERS.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

}