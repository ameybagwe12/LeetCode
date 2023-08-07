package Arrays;
import java.util.*;
import java.lang.*;
public class CustomSort {

    public static void main(String[] args) {
        System.out.println(specificOrder("acabd", "abc"));
    }
    public static String specificOrder(String x, String y) {

        if (y.length() == 0) {
        /*
            If y is empty then x is already in the specific
            order of characters.
        */
            return x;
        }

        StringBuilder ans = new StringBuilder();
        HashSet < Character > visited = new HashSet < Character > ();

        for (int i = 0; i < y.length(); i++) {
            for (int j = 0; j < x.length(); j++) {
                if (y.charAt(i) == x.charAt(j)) {
                    // If yi = xj, then pick this character.
                    ans.append(y.charAt(i));
                }
            }

        /*
            Now add this character in the visited set,
            so that we can find the remaining characters later.
        */
            visited.add(y.charAt(i));
        }

        for (int i = 0; i < x.length(); i++) {
            if (!visited.contains(x.charAt(i))) {
            /*
                If character is not visited
                previously then pick it.
            */
                ans.append(x.charAt(i));
            }
        }

        String s = ans.toString();
        return s;

    }
}
