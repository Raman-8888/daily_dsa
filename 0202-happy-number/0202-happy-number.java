class Solution {
    public int next(int n)
    {
        int sum=0;
        while(n>0)
        {
            int temp=n%10;
            sum+=temp*temp;
            n=n/10;

        }
        return sum;
    }
    public boolean isHappy(int n) {

        int slow=n;
        int fast=next(n);

        while(fast!=1  && slow!=fast)
        {
            slow=next(slow);
            fast=next(next(fast));

        }
        return fast==1;

        
    }
}