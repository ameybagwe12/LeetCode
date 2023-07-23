package Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, 12,34,56,78,99,101,120,123};
        int target = 34;
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            // to avoid the int range extending
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid-1;
            }
            else if (arr[mid] < target) {
                start = mid+1;
            }
            else return mid;
        }
        return -1;
    }
}
