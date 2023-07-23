package Search;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {12, 7,4,89,76,90,15,67};
        MinMax obj=  new MinMax();
        obj.minMax(arr);
    }
    void minMax (int arr[]) {
        int small = arr[0];
        int large = arr[0];
        for(int i=0 ;i< arr.length;i++)
        {
            if(large < arr[i])
            {
                large = arr[i];
            }
            if(small > arr[i]) {
                small = arr[i];
            }
        }
        System.out.println(large);
        System.out.println(small);
    }
}
