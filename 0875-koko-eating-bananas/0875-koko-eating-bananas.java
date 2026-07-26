class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max=-1;
        for(int i:piles)
        {
            max=Math.max(max,i);
        }
         
         int low=1,high=max;
         int ans=max;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            

            if(check(piles,mid)<=h)
            {
                ans=mid;
                high=mid-1;

            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }

    public long check(int []arr, int mid)
    {
        long sum=0;

        for(int i:arr)
        {
           sum+= (long)Math.ceil((double)i/mid);
        }
        return sum;
    }
}