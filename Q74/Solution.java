class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int l = 0;
        int r = m - 1;

        while(l <= r) {
            int mid = l + (r - l) / 2;

            if(target >= matrix[mid][0] && target <= matrix[mid][n - 1]) {
                return bs(matrix, mid, target);
            }
            else if(target > matrix[mid][n - 1]) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return false;
    }

    boolean bs(int[][] arr, int row, int target) {
        int l = 0;
        int r = arr[0].length - 1;

        while(l <= r) {
            int mid = l + (r - l) / 2;

            if(arr[row][mid] == target) {
                return true;
            }
            else if(arr[row][mid] > target) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }

        return false;
    }
}