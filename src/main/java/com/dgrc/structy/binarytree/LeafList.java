package com.dgrc.structy.binarytree;

import java.util.ArrayList;
import java.util.List;

public class LeafList {

    public static void main(String[] args) {

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
        System.out.println(leafList(a)); // -> [ "d", "e", "f" ] 
        
    }

    public static <T> List<T> leafList(Node<T> root) {
        
        List<T> list = new ArrayList<>();
        leafList(root, list);
        return  list;
    }

    public static <T> void leafList(Node<T> root, List<T> list) {
        
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            list.add(root.val);
        }

        leafList(root.left, list);
        leafList(root.right, list);
        
    }
    
}
