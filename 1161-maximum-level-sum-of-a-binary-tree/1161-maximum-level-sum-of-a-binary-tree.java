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
    public int maxLevelSum(TreeNode root) {

        int sum=Integer.MIN_VALUE;
        int res=1;
        if(root==null)return res;

        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        int currlvl=1;
        while(!queue.isEmpty())
        {
            int len=queue.size();
            
            int levelsum=0;
            for(int i=0;i<len;i++)
            {
                TreeNode node=queue.poll();
                levelsum+=node.val;
                if(node.left!=null)queue.add(node.left);
                if(node.right!=null)queue.add(node.right);
            }
            if(levelsum>sum)
            {
                sum=levelsum;
                res=currlvl;
            }
            currlvl++;

        }

        return res;
        
    }
}