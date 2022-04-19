package AdvancedDataStructures.tree;

class Node{
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
public class BinaryTreeImplementation {
    Node root;

    // Constructors
    BinaryTreeImplementation(int key)
    {
        root = new Node(key);
    }

    BinaryTreeImplementation()
    {
        root = null;
    }

    void printPostorder(Node node)
    {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }
    void printInorder(Node node)
    {
        if (node == null)
            return;
        printPostorder(node.left);
        System.out.print(node.key + " ");
        printPostorder(node.right);

    }
    void printPreorder(Node node)
    {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        printPostorder(node.left);
        printPostorder(node.right);
    }
    void printPostorder() { printPostorder(root); }
    void printInorder() { printInorder(root); }
    void printPreorder() { printPreorder(root); }
    public static void main(String[] args) {
        BinaryTreeImplementation tree = new BinaryTreeImplementation();
        tree.root=new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

        System.out.println("In order");
        tree.printInorder();
        System.out.println();
        System.out.println("post order");
        tree.printPostorder();
        System.out.println();
        System.out.println("pre order");
        tree.printPreorder();

    }
}
