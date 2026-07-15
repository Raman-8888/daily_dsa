/* A binary tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        
        ArrayList<Integer>res=new ArrayList<>();
        if(root==null)return res;
        
        Deque<Node>q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            Node curr=q.poll();
            
            res.add(curr.data);
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
            
            
            
            
        }
        return res;
        // code here
        
    }
}