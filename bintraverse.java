class treeNode {
    int data;
    treeNode left;
    treeNode right;

    treeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class bintraverse {
    public static void intraverse(treeNode root) {
        if (root == null) {
            return;
        }
        intraverse(root.left);
        System.out.print(root.data + " ");
        intraverse(root.right);
    }

    public static void pretraverse(treeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        pretraverse(root.left);
        pretraverse(root.right);
    }

    public static void posttraverse(treeNode root) {
        if (root == null) {
            return;
        }
        posttraverse(root.left);
        posttraverse(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        treeNode root = new treeNode(1);
        root.left = new treeNode(2);
        root.right = new treeNode(3);
        root.left.left = new treeNode(4);
        root.left.right = new treeNode(5);
        root.right.left = new treeNode(6);
        root.right.right = new treeNode(7);
        System.out.println("Inorder Traversal: ");
        intraverse(root);
        System.out.println("\nPreorder Traversal: ");
        pretraverse(root);
        System.out.println("\nPostorder Traversal: ");
        posttraverse(root);
    }
}