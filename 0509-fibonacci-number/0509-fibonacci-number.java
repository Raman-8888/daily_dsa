class Solution {
    public int fib(int n) {
        if(n<=1)return n;

        

        int last=1;
        int slast=0;
        for(int i=2;i<=n;i++)
        {
            int ans=last+slast;
            slast=last;
            last=ans;

        }
        return last;
        
    }
}