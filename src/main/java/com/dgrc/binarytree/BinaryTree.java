package main.java.com.dgrc.binarytree;

public class BinaryTree {

    Node root;

    public void add(int value) {
        root = insert(root, value);
        
    }

    private Node insert (Node current, int value) {

        if (current == null) {
            return new Node(value);
        } else if (value < current.value) {
            insert(current.left, value);
        } else if (value > current.value) {
            insert(current.right, value);
        } 

        System.out.println(root);

        return current;

    }

    public void transverseInOrder (Node node) {
        
    }

}
