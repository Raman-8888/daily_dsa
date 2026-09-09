class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int low = 0;
        int high = (rows * cols) - 1; // Total elements - 1
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Map the 1D index back to 2D matrix coordinates
            int midValue = matrix[mid / cols][mid % cols];
            
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return false;
    }
}
