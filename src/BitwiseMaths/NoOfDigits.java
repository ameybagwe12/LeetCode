package BitwiseMaths;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;
        int ans = 1 + (int) (Math.log(n) / Math.log(b));
        System.out.println(ans);
    }
}
