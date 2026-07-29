class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        // Step 1: Initialize boolean array for space-optimized DP
        boolean dp[] = new boolean[sum + 1];
        dp[0] = true; 
        
        // Step 2 & 3: Iterate through elements and update the table backwards
        for (int num : arr) {
            for (int j = sum; j >= num; j--) {
                if (dp[j - num]) {
                    dp[j] = true;
                }
            }
            // Optimization: Stop early if the target sum is already reached
            if (dp[sum]) {
                return true;
            }
        }
        
        return dp[sum];
    }
}
