class Solution {
    public void solve(List<List<Integer>>res,List<Integer>temp,int[]arr,int st)
    {
        if(res.contains(temp))
        {
            return;

        }
        res.add(new ArrayList<>(temp));

        for(int i=st;i<arr.length;i++)
        {
            temp.add(arr[i]);

            solve(res,temp,arr,i+1);

            temp.remove(temp.size()-1);
        }

    }

    public List<List<Integer>> subsetsWithDup(int[] arr) {
       
       List<List<Integer>>res=new ArrayList<>();
       List<Integer>temp=new ArrayList<>();
       Arrays.sort(arr);

       solve(res,temp,arr,0);

       return res;
        
    }
}