package com.dgrc.structy.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllTreePaths {

    public static void main(String[] args) {
        // Test1
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
        System.out.println(allTreePaths(a)); // ->
        // [ 
        //   [ 'a', 'b', 'd' ], 
        //   [ 'a', 'b', 'e' ], 
        //   [ 'a', 'c', 'f' ] 
        // ] 
                
    }

    public static <T> List<List<T>> allTreePaths(Node<T> root) {
        
        if (root == null) {
            return new ArrayList<>();
        }
        
        System.out.println("\nval: " + root != null ? root.val : null);

        if (root.left == null && root.right == null) {
            System.out.println(Arrays.asList(Arrays.asList(root.val)));
            return List.of(List.of(root.val));
        }

        List<List<T>> list = new ArrayList<>();
        System.out.println("list: " + list);

        List<List<T>> leftPaths = allTreePaths(root.left);
        System.out.println("leftPaths: " + leftPaths);
        for (List<T> path : leftPaths) {
            List<T> newPath = new ArrayList<>();
            newPath.add(root.val);
            newPath.addAll(path);
            System.out.println("newPath: " + newPath);
            list.add(newPath);
            System.out.println("list: " + newPath);
        }
        
        List<List<T>> rightPaths = allTreePaths(root.right);
        System.out.println("rightPaths: " + rightPaths);
        for (List<T> path : rightPaths) {
            List<T> newPath = new ArrayList<>();
            newPath.add(root.val);
            newPath.addAll(path);
            System.out.println("newPath: " + newPath);
            list.add(newPath);
            System.out.println("list: " + newPath);
        }
        
        return list;
    }
    
}
