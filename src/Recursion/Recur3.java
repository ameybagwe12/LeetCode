package Recursion;

public class Recur3 {
    public static void main(String[] args) {
        System.out.println(numOfSteps(41));
    }
    static int numOfSteps(int num) {
        return helper(num,0);
    }
    private static int helper(int num, int s) {
        if(num == 0) {
            return s;
        }
        if(num % 2 == 0) {
            return helper(num / 2, s + 1);
        }
        return helper(num-1, s+1);
    }
}
