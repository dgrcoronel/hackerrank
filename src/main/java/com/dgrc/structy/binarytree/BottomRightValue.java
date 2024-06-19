package com.dgrc.structy.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BottomRightValue {

    public static void main(String[] args) {

        // Test 1
        Node<Integer> a = new Node<>(3);
        Node<Integer> b = new Node<>(11);
        Node<Integer> c = new Node<>(10);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(-2);
        Node<Integer> f = new Node<>(1);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        //       3
        //    /    \
        //   11     10
        //  / \      \
        // 4   -2     1
        System.out.println(bottomRightValue(a)); // -> 1
        
    }

    public static <T> T bottomRightValue(Node<T> root) {
        
        if (root == null) {
            return null;
        }

        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(root);
        Node<T> node = new Node<>(null);

        while (!queue.isEmpty()) {
            node = queue.remove();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return node.val;
    }
    
}
