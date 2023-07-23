package Search;

public class LinearSearch {
    public static void main(String[] args) {
        int []nums = {23,45,67,78,89,9};
        int target = 67;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    // search in the array: return the index if item found
    static int linearSearch(int[] arr, int target) {
        int ind = 0;
        if (arr.length == 0) return -1;
        for(int a=0; a< arr.length ;a++ ) {
            if (arr[a] == target) {
                ind = a;
                break;
            }
        }
        return ind;
    }
}
