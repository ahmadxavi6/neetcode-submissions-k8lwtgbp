public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix[0].length - 1;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target && matrix[i][len] >= target) {
                if (searchThisArray(matrix[i], target)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean searchThisArray(int[] arr, int target) {
        int i = 0, j = arr.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] == target) {
                return true;
            }

            if (arr[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return false;
    }
}