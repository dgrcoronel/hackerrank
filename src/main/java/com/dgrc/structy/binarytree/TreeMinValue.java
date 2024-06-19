package com.dgrc.structy.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeMinValue {

    public static void main(String[] args) {

        // Test 1
        Node<Double> a = new Node<>(3.);
        Node<Double> b = new Node<>(11.);
        Node<Double> c = new Node<>(4.);
        Node<Double> d = new Node<>(4.);
        Node<Double> e = new Node<>(-2.);
        Node<Double> f = new Node<>(1.);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        //       3
        //    /    \
        //   11     4
        //  / \      \
        // 4   -2     1
        System.out.println(treeMinValue(a)); // -> -2
        
    }

    // depth first
    // public static Double treeMinValue(Node<Double> root) {
        
    //     if (root == null) {
    //         return Double.POSITIVE_INFINITY;
    //     }

    //     double min = Math.min(treeMinValue(root.left), treeMinValue(root.right));

    //     return Math.min(root.val, min);

    // }
    
    // breadth first
    public static Double treeMinValue(Node<Double> root) {
        
        if (root == null) {
            return Double.POSITIVE_INFINITY;
        }

        double min = Double.POSITIVE_INFINITY;
        Queue<Node<Double>> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<Double> node = queue.remove();
            min = Math.min(min, node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return min;
    }
}
