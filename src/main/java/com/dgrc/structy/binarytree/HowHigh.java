package com.dgrc.structy.binarytree;

public class HowHigh {
    
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
        System.out.println(howHigh(a)); // -> 2
        
    }

    public static <T> int howHigh(Node<T> root) {
        
        if (root == null) {
            return -1;
        }

        return Math.max(howHigh(root.left), howHigh(root.right)) + 1;

    }
}
