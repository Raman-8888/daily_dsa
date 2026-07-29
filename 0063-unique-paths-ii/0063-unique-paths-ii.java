class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        // Base case: If the starting point or destination has an obstacle, 0 paths
        if (arr[0][0] == 1 || arr[m - 1][n - 1] == 1) return 0;

        int dp[][] = new int[m][n];
        dp[0][0] = 1; // Base case initialization

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Skip the starting point as it is already initialized
                if (i == 0 && j == 0) continue;

                // If current cell is an obstacle, paths to it remain 0
                if (arr[i][j] == 1) {
                    dp[i][j] = 0;
                    continue;
                }

                int up = 0, left = 0;

                if (i - 1 >= 0) {
                    up = dp[i - 1][j];
                }
                if (j - 1 >= 0) {
                    left = dp[i][j - 1]; // FIXED: Changed 'up' to 'left' here
                }

                dp[i][j] = up + left;
            }
        }
        return dp[m - 1][n - 1];
    }
}
