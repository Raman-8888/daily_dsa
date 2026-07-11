class Solution {
    public int candy(int[] arr) {
        int n=arr.length;
        int ban[]=new int[n];
        Arrays.fill(ban,1);

        boolean check = true;

        while(check)
        {
            check = false;

            for(int i=1;i<n;i++)
            {       
                if(arr[i]>arr[i-1] && ban[i]<=ban[i-1])
                {
                    ban[i]=ban[i-1]+1;
                    check=true;
                }

                if(arr[i]<arr[i-1] && ban[i-1]<=ban[i])
                {
                    ban[i-1]=ban[i]+1;
                    check=true;
                }
            }
        } 
        int sum=0;
        
        for(int j=0;j<n;j++)
        {
            System.out.print(ban[j]+" ");
            sum+=ban[j];
        }      
        System.out.print("\n"+sum);
        return sum;
        
    }
}