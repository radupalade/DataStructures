package tree;

public class Main {
    public static void main(String[] args) {
        MyBinarySearchTree mb = new MyBinarySearchTree();

        mb.root = mb.add(mb.root, 8);
        mb.add(mb.root, 3);
        mb.add(mb.root, 4);
        mb.add(mb.root, 5);
        mb.add(mb.root, 6);

        mb.showInOrder(mb.root);
        System.out.println();
        mb.showPostOrder(mb.root);
        System.out.println();
        mb.showPreOrder(mb.root);
        System.out.println();
        mb.outOfOrder(mb.root);
        System.out.println();

        System.out.println("nr de noduri este: " + mb.countNodes(mb.root));
    }

}
