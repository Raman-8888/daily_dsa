class Solution {
    public void moveZeroes(int[] nums) {
        int s=0;
        for(int f=0;f<nums.length;f++)
        {
            if(nums[f]!=0)
            {
                int temp=nums[f];
                nums[f]=nums[s];
                nums[s]=temp;
                s++;
            }

        }
        
        
    }
}