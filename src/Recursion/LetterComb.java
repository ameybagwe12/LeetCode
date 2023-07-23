package Recursion;

public class LetterComb {
    public static void main(String[] args) {
        phonePad("", "12");
    }
    static void phonePad(String p, String up) {
//        combinations
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        else {
            int digit = up.charAt(0) - '0'; // if '2' -> 50 - 48 = 2
            for (int i = (digit - 1) * 3; i < digit * 3; i++) { // [0-2], [3,6]
                char ch = (char) ('a' + i);
                phonePad(p + ch, up.substring(1));
            }
        }
    }
}
