package main.java.com.dgrc.structy.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeIncludes {

    public static void main(String[] args) {

        // Test 1
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        //      a
        //    /   \
        //   b     c
        //  / \     \
        // d   e     f
        System.out.println(treeIncludes(a, "e")); // -> true
        
    }

    // public static boolean treeIncludes(Node<String> root, String target) {
        
    //     if (root == null) {
    //         return false;
    //     }

    //     if (root.val == target) {
    //         return true;
    //     }

    //     return treeIncludes(root.right, target) || treeIncludes(root.left, target);
    // }

    public static boolean treeIncludes(Node<String> root, String target) {
        
        if (root == null) {
            return false;
        }
        
        Queue<Node<String>> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<String> node = queue.remove();
            if (node.val.equals(target)) {
                return true;
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        
        return false;
    }
    
}
