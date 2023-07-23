package Recursion;
// Find nth fibonacci number
public class Recur1 {
    public static void main(String[] args) {
        int ans= fibo(6);
        System.out.println(ans);
    }
    // n is the nth fibo number
    static int fibo(int n) {
        if(n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else return fibo(n-1) + fibo(n-2);
    }
}
