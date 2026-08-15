class Solution {
    public int maxArea(int[] height) {


        int left=0;
        int right=height.length-1;
        int max=0;

        while(left<right)
        {
            int currBase=right-left;
            int currHeight=Math.min(height[left],height[right]);
            int currArea=currBase*currHeight;

            max=Math.max(currArea,max);

            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max;
        
    }
}