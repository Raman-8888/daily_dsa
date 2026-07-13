class Solution {
    
    public static boolean solve(int i,int currSum,int target,int[] arr)
    {
        if(currSum==target)
        {
            return true;
        }
        if(i>=arr.length || currSum>target)
        
        {
            return false;
        }
        
        boolean pick=solve(i+1,currSum+arr[i],target,arr);
        if(pick==true)return true;
        
        boolean notPick=solve(i+1,currSum,target,arr);
        return notPick;
    }
    
    static boolean isSubsetSum(int arr[], int sum) {
        
        return solve(0,0,sum,arr);
        
    }
}