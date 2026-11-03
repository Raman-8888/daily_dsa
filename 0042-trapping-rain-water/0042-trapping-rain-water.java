class Solution {
    public int trap(int[] height) {
        // 
        int start=0;
        int end=0;
        int ans=0;
        int count=0;
        int neg=0;


        
        while(end<height.length)
        {
            if(end<height.length&&height[end]<height[start])
            {
                neg+=height[end];
                count++;

            }
            if(end<height.length &&(height[end]==height[start] || height[end]>height[start]))
            {
                ans+=height[start]*count - neg;

                start=end;
                count=0;
                neg=0;
            }

            System.out.println("Start: "+ height[start] +" End: "+height[end]+" Count: "+count+" Neg: "+neg+" Ans: "+ans);
            end++;
        }


        int rstart=height.length-1;
        int rend=height.length-1;
        count=0;
        neg=0;

        while(start<=rend)
        {
            if(start<=rend && height[rstart]>height[rend])
            {
                count++;
                neg+=height[rend];
            }
            else
            {
                ans+=height[rstart]*count-neg;
                rstart=rend;
                count=0;
                neg=0;

            }
            rend--;
        }

        


       return ans;
    }
}