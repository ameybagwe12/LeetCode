package Search;

public class Mountain {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target) {
        int peak = peakIndex(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        return firstTry;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]) {
                end = mid-1; // it can be ans hence not mid - 1;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
}
