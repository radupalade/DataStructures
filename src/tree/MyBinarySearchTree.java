package tree;

public class MyBinarySearchTree {
    Node root;

    public Node add(Node n, int value) {
        if (n == null) {
            n = new Node(value);
        } else {
            if (value < n.info) {
                n.left = add(n.left, value);
            } else {
                n.right = add(n.right, value);
            }
        }
        return n;
    }

    public void showInOrder(Node n) {
        if (n == null) {
            return;

        } else {
            showInOrder(n.left);
            System.out.print(n.info + " ");
            showInOrder(n.right);

        }
    }

    public void showPostOrder(Node n) {
        if (n == null) {

            return;

        } else {
            showPostOrder(n.left);
            showPostOrder(n.right);
            System.out.print(n.info + " ");


        }
    }

    public void showPreOrder(Node n) {
        if (n == null) {
            return;

        } else {
            System.out.print(n.info + " ");
            showPreOrder(n.left);
            showPreOrder(n.right);


        }
    }

    public void outOfOrder(Node n) {
        if (n == null) {

            return;
        } else {
            outOfOrder(n.right);
            System.out.print(n.info + " ");
            outOfOrder(n.left);


        }
    }

    public int countNodes(Node n) {
        int count = 0;

        if (n != null) {
            count = countNodes(n.right) + countNodes(n.left) + 1;


        }
        return count;

    }
}
