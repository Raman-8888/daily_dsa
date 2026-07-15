/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public void pre(ArrayList<Integer>res,Node root)
    {
        if(root==null)return;
        res.add(root.data);
        pre(res,root.left);
        pre(res,root.right);
    }
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer>res=new ArrayList<>();
        pre(res,root);
        return res;
    }
}