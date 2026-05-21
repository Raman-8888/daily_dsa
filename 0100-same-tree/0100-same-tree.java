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
     boolean res=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        inorder(p,q);
        return res;
                       
    }

    public boolean inorder(TreeNode p,TreeNode q)
    {
        if(p==null&&q==null)return true;
        if(p==null||q==null)
        {
            res=false;
            return false;
        }
        inorder(p.left,q.left);
        if(p.val!=q.val)res= false;
        inorder(p.right,q.right);
        return res;
    }
}