/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */



class Solution {
    // Helper function to check if a node is a leaf
    private boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }

    // 1. Add left boundary nodes (excluding leaves)
    private void addLeftBoundary(Node root, ArrayList<Integer> res) {
        Node curr = root.left;
        while (curr != null) {
            if (!isLeaf(curr)) {
                res.add(curr.data);
            }
            if (curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }

    // 2. Add all leaf nodes from left to right
    private void addLeaves(Node root, ArrayList<Integer> res) {
        if (root == null) return;
        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        addLeaves(root.left, res);
        addLeaves(root.right, res);
    }

    // 3. Add right boundary nodes in reverse order (excluding leaves)
    private void addRightBoundary(Node root, ArrayList<Integer> res) {
        Node curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while (curr != null) {
            if (!isLeaf(curr)) {
                temp.add(curr.data);
            }
            if (curr.right != null) curr = curr.right;
            else curr = curr.left;
        }
        // Reverse to get anti-clockwise bottom-to-top order
        for (int i = temp.size() - 1; i >= 0; i--) {
            res.add(temp.get(i));
        }
    }

    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;

        // Add root node if it's not a leaf
        if (!isLeaf(root)) {
            res.add(root.data);
        }

        addLeftBoundary(root, res);
        addLeaves(root, res);
        addRightBoundary(root, res);

        return res;
    }
}
