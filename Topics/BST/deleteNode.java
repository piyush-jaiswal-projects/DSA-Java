public class deleteNode {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node delete(Node root, int val) {
        if (val > root.data) {
            root.right = delete(root.right, val);
        } else if (val < root.data) {
            root.left = delete(root.left, val);
        } else {
            //case 1 leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            //case 2 single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //case 3 two children
            Node inorderSucc = findInorderSuccessor(root.right);
            root.data = inorderSucc.data;
            root.right = delete(root.right, inorderSucc.data);
        }
        return root;
    }
    
    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    
    public static void main(String[] args) {
        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        root = delete(root, 1);

        inorder(root);
        System.out.println();

    }
}
