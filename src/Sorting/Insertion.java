package Sorting;

public class Insertion {
    public static void main(String[] args) {
        int[] a = {3,1,5,4,2};
        insertSort(a, a.length);
        for(int ar : a) {
            System.out.print(ar+" ");
        }
    }
    static void insertSort(int[] a, int n) {
        int temp,i,j;
        for(i=1;i<=n-1;i++)
        {
            temp=a[i];
            for(j=i-1;j>=0;j--)
            {
                if(a[j]<temp) break;
                a[j+1]=a[j];
            }
            a[j+1]=temp;
        }
    }

}
