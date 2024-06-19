package com.dgrc.structy.binarytree;

import java.util.ArrayList;
import java.util.List;

public class TreeLevels {

    public static void main(String[] args) {

        // test 1
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
        System.out.println(treeLevels(a)); // ->
        // [
        //   ['a'],
        //   ['b', 'c'],
        //   ['d', 'e', 'f']
        // ]
        
    }

    // Breadth
    // public static <T> List<List<T>> treeLevels(Node<T> root) {
        
    //     if (root == null) {
    //         return List.of();
    //     }

    //     List<List<T>> list = new ArrayList<>(); 
    //     Queue<SimpleEntry<Node<T>,Integer>> queue = new ArrayDeque<>();
    //     queue.add(new SimpleEntry<>(root, 0));

    //     while (!queue.isEmpty()) {
    //         SimpleEntry<Node<T>,Integer> entry = queue.remove();
    //         Node<T> node = entry.getKey();
    //         int level = entry.getValue();
    //         if (level == list.size()) {
    //             List<T> newList = new ArrayList<>();
    //             newList.add(node.val);
    //             list.add(newList);
    //         } else {
    //             list.get(level).add(node.val);
    //         }
    //         if (node.left != null) {
    //             queue.add(new SimpleEntry<>(node.left, level + 1));
    //         }
    //         if (node.right != null) {
    //             queue.add(new SimpleEntry<>(node.right, level + 1));
    //         }

    //     }

    //     return list;
    // }

    public static <T> List<List<T>> treeLevels(Node<T> root) {
        List<List<T>> list = new ArrayList<>();
        treeLevels(root, 0, list);
        return list;
    }

    public static <T> void treeLevels(Node<T> root, int level, List<List<T>> list) {
        
        if (root == null) {
            return;
        }

        if (level == list.size()) {
            List<T> newList = new ArrayList<>();
            newList.add(root.val);
            list.add(newList);
        } else {
            list.get(level).add(root.val);
        }

        treeLevels(root.left, level + 1, list);
        treeLevels(root.right, level + 1, list);   

    }
    
}
