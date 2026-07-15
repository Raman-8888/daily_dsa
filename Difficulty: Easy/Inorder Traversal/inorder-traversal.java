/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    
    
    public void inorder(Node root,ArrayList<Integer>res)
    {
        if(root==null)return;
        
        inorder(root.left,res);
        res.add(root.data);
        inorder(root.right,res);
    }
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        inorder(root,res);
        return res;
    }
}