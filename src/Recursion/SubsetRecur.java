package Recursion;
import java.lang.*;
public class SubsetRecur {
    // combinations
    public static void main(String[] args) {
        subStr("", "abc");
    }
    static void subStr(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
        }
        else {
            char ch = up.charAt(0);
            subStr(p+ch,up.substring(1));
            subStr(p, up.substring(1));
        }
    }
}
