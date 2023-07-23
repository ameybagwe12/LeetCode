package Sorting;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        int[] ans = bubbleSort(arr);
        for(int i=0 ;i < ans.length;i++) {
            System.out.print(ans[i]+" ");
        }
    }

    static int[] bubbleSort(int[] arr) {
        int temp;
        for(int i=0;i<arr.length;i++) {
            for(int j=0; j<arr.length-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
