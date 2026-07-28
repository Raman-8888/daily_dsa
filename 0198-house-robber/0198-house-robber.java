import java.util.Arrays;

class Solution {
    public int ans(int idx, int dp[], int nums[]) {
        if (idx == 0) {
            return nums[idx];
        }
        if (idx < 0) {
            return 0;
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }

        int rob = nums[idx] + ans(idx - 2, dp, nums);
        int not_rob = ans(idx - 1, dp, nums);
        
        return dp[idx] = Math.max(rob, not_rob); // Cache and return
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0; // Edge case handling

        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        
        return ans(n - 1, dp, nums); // Fixed: Start from n - 1
    }
}
