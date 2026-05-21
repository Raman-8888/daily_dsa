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
    int sum[]={0};
    public int diameterOfBinaryTree(TreeNode root) {

        inorder(root);
        return sum[0];
        
    }

    public int inorder(TreeNode root)
    {
       if(root==null)return 0;
       int left=inorder(root.left);
       int right=inorder(root.right);

       sum[0]=Math.max(sum[0],left+right);
       return 1+Math.max(left,right);
    }
}