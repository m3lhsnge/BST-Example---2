public class BST {
    Node root;

    public BST() {
        root = null;
    }

    public Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.data) {
            node.left = insert(node.left, value);
        } 
        else if (value > node.data) {
            node.right = insert(node.right, value);
        }

        return node;
    }

    public boolean search(Node node, int value) {
        if (node == null) return false;

        if (node.data == value) return true;

        if (value < node.data) return search(node.left, value);
        
        return search(node.right, value);
    }

    public int findMin(Node node) {

        if (node == null) return -1;

        while (node.left != null) {
            node = node.left;
        }
        
        return node.data;
    }
}
