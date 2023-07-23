package Recursion;

public class LinearRecur {
    public static void main(String[] args) {
        int[] arr = {5,7,2,4,9,8};
        LinearRecur obj = new LinearRecur();
        System.out.println(obj.linearSearch(arr,4,0));
    }
    public int linearSearch(int[] arr, int target, int index) {
        if(arr[index] == target){
            return index;
        }
        else if (index == arr.length) {
            return -1;
        }
        else return linearSearch(arr, target, index+1);
    }
}
