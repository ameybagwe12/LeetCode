package BitwiseMaths;
import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        int n = 66;
        System.out.println(isOdd(n));

    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1; // bitwise and --> gives last num (1101) gives 1
    }
}
