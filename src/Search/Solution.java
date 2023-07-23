package Search;

class Solution {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));

    }
    public static boolean searchMatrix(int[][] mat, int target) {
        int r=mat.length;
        int c=mat[0].length;
        int low=0;
        int high=r*c-1;
        while(low<=high){
            int mid=(low+high)/2;
            int j=mid%c;
            int i=(mid-j)/c;
            if(mat[i][j]==target) return true;
            else if(mat[i][j]>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}