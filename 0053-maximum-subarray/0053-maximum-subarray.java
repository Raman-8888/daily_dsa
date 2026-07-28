class Solution {
    public int maxSubArray(int[] arr) {
        int n=arr.length;
        if(n==1)return arr[0];

        int dp[]=new int[n];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[1],dp[0]+arr[1]);

        for(int i=2;i<n;i++)
        {
            dp[i]=Math.max(arr[i],dp[i-1]+arr[i]);
        }

        int max=Integer.MIN_VALUE;

        for(int i:dp)
        {
            max=Math.max(i,max);
        }
        return max;

        
    }
}