package Search;

import java.util.Arrays;

public class StrictSorted2d {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.toString(search(arr, 8)));
    }
    static int[] binSearch(int[][] mat, int row, int colSt, int colEnd, int target) {
        while(colSt <= colEnd) {
            int mid = colSt + (colEnd - colSt)/2;
            if(mat[row][mid] == target) {
                return new int[]{row, mid};
            }
            if(mat[row][mid] < target) {
                colSt = mid + 1;
            }
            else{
                colEnd = mid - 1;
            }
        }
        return new int[] {-1,-1};
    }
    static int[] search(int[][] mat, int target) {
        int rows = mat.length;
        int col = mat[0].length; // can also be empty matrix

        if(rows == 1) {
            return binSearch(mat,0,0,col-1,target);
        }

        int rSt = 0;
        int rEnd = rows - 1;
        int cMid = col / 2 ;
        // run the loop till 2 rows are remaining
        while(rSt < (rEnd - 1)){
            //while true it will have more than 2 rows
            int mid = rSt + (rEnd - rSt) / 2;
            if(mat[mid][cMid] == target) {
                return new int[] {mid, cMid};
            }
            if(mat[mid][cMid] < target) {
                rSt = mid;
            }
            else {
                rEnd = mid;
            }
        }
        // now we have two rows
        // check whether the target is int the col of 2 rows
        if(mat[rSt][cMid] == target) {
            return new int[]{rSt, cMid};
        }
        if(mat[rSt+1][cMid] == target) {
            return new int[] {rSt+1, cMid};
        }

        //search in first half
        if(target <= mat[rSt][cMid - 1]){
            return binSearch(mat, rSt,0, cMid - 1, target);
        }
        //search in second half
        if(target >= mat[rSt][cMid + 1] && target <= mat[rSt][col-1]){
            return binSearch(mat, rSt,cMid+1, col-1, target);
        }
        //search in third half
        if(target <= mat[rSt + 1][cMid - 1]){
            return binSearch(mat, rSt+1,0, cMid - 1, target);
        }
        //search in fourth half
        if(target <= mat[rSt + 1][cMid + 1]){
            return binSearch(mat, rSt+1,cMid+1, col-1, target);
        }
        return new int[]{-1,-1};
    }
}
