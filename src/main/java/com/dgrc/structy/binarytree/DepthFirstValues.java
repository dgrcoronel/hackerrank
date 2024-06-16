package com.dgrc.structy.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstValues {
    
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
        System.out.println(depthFirstValues(a)); 
        System.out.println("[a, b, d, e, c, f]");
        //    -> ["a", "b", "d", "e", "c", "f"]
        
    }

    public static List<String> depthFirstValues(Node<String> root) {

        if (root == null) {
            return new ArrayList<>();
        }

        List<String> list = new ArrayList<>();
        Stack<Node<String>> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            System.out.println("stack: " + stack);
            Node<String> node = stack.pop();
            list.add(node.val);
            System.out.println("list: " + list);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return list;
    }
}
