package BitwiseMaths;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int uni = 0;
        for(int n : arr) {
            uni ^= n;
        }
        return uni;
    }
}
