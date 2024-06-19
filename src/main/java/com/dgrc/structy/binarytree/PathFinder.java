package com.dgrc.structy.binarytree;

import java.util.LinkedList;
import java.util.List;

public class PathFinder {

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
        System.out.println(pathFinder(a, "e")); // -> [ "a", "b", "e" ]
        
    }

    // Depth First Recursive
    public static <T> List<T> pathFinder(Node<T> root, T target) {
        
        if (root == null) {
            return null;
        }

        if (root.val == target) {
            List<T> list = new LinkedList<>();
            list.add(target);
            return list;
        }

        List<T> leftPath = pathFinder(root.left, target);
        if (leftPath != null) {
            leftPath.add(0, root.val);
            return leftPath;
        }

        List<T> rightPath = pathFinder(root.right, target);
        if (rightPath != null) {
            rightPath.add(0, root.val);
            return rightPath;
        }

        return null;
    }

}
