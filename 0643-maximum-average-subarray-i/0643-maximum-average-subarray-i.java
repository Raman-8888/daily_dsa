class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n=arr.length;
        int max=Integer.MIN_VALUE;

        

        int sum=0;


        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            

            if(i-k>=0)
            {
                sum-=arr[i-k];
            }

            if(i>=k-1)
            {
                max=Math.max(max,sum);
                


            }
        }
       
        return (double)max/k;
    }
}