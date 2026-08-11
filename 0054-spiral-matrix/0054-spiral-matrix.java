class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>res=new ArrayList<>();
        if(matrix == null || matrix.length == 0){
            return res;
        }
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0,left=0;
        int buttom=m-1,right=n-1;

        while(top<=buttom && left<=right)
{
        for(int i=left;i<=right;i++)
        {
            res.add(matrix[top][i]);
        }

        top++;

        for(int i=top;i<=buttom;i++)
        {
            res.add(matrix[i][right]);
        }
        right--;


        if(top<=buttom)
        {

        for(int i=right;i>=left;i--)
        {
            res.add(matrix[buttom][i]);

        }
        buttom--;
        }

    if(left<=right)
    {

        for(int i=buttom;i>=top;i--)
        {
            res.add(matrix[i][left]);
        }
        left++;
    }

}
    return res;



        
    }
}