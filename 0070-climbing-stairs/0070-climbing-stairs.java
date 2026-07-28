class Solution {
    public int climbStairs(int n) {
        // Cache to store the results of subproblems
        int[] memo = new int[n + 1];
        return ans(n, memo);
    }

    private int ans(int n, int[] memo) {
        // Base cases
        if (n == 0 || n == 1) return 1;
        
        // If already computed, return the cached result
        if (memo[n] != 0) return memo[n];

        // Store the computation in the memo array
        memo[n] = ans(n - 1, memo) + ans(n - 2, memo);
        return memo[n];
    }
}
