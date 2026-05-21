/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {

        boolean res=true;

        Queue<TreeNode>queue=new LinkedList<>();
        if(root==null)return res;
        queue.add(root);

        while(!queue.isEmpty())
        {
            boolean lvlres=true;
            int len=queue.size();
            List<Integer>level=new ArrayList<>();

            for(int i=0;i<len;i++)
            {
                TreeNode node=queue.poll();
                if(node==null)
                {
                    level.add(-111);
                    continue;
                }
                level.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }

            int fr=0,end=level.size()-1;
            while(end>fr)
            {
                if(!level.get(fr).equals(level.get(end)))return false;   
                fr++;
                end--;


            }
            
            

        }
        
        
        return res;


        
    }
}