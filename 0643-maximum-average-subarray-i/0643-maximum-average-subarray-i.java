class Solution {
    public double findMaxAverage(int[] arr, int k) {
        
        int sum=0;

        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int max=sum;

        for(int i=k;i<arr.length;i++)
        {
            sum+=arr[i];
            sum-=arr[i-k];
            max=Math.max(sum,max);

        }
        return (double) max/k;
        
    }
}