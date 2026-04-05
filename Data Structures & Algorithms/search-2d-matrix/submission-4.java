public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean res = false;
        int len = (matrix[0].length) -1;
      for(int i = 0 ; i<matrix.length; i++){
        if(matrix[i][0] <= target && matrix[i][len] >= target){
            res = this.searchThisArray(matrix[i],target);
        }
        if(res == true){
            return true;
        }
      }
      return false;
    }

    public boolean searchThisArray(int arr[],int target){
        int mid =0;
        int i =0;
        int j = arr.length-1;

        while(i<=j){
            mid = i + (j-i) /2;
            if(arr[mid]== target){
                return true;
            }
            if(arr[mid]<target){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return false;
    }
}