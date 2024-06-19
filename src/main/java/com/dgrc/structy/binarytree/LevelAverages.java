package com.dgrc.structy.binarytree;

import java.util.ArrayList;
import java.util.List;

public class LevelAverages {

    public static void main(String[] args) {

        // Test 1
        Node<Integer> a = new Node<>(3);
        Node<Integer> b = new Node<>(11);
        Node<Integer> c = new Node<>(4);
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
        //   11     4
        //  / \      \
        // 4   -2     1
        System.out.println(levelAverages(a)); // -> [ 3., 7.5, 1. ] 
        
    }

    // Breath 
    // public static List<Double> levelAverages(Node<Integer> root) {
        
    //     if (root == null) {
    //         return List.of();
    //     }

    //     List<Double> averageList = new ArrayList<>();
    //     List<List<Integer>> list = new ArrayList<>();
    //     Queue<SimpleEntry<Node<Integer>,Integer>> queue = new ArrayDeque<>();
    //     queue.add(new SimpleEntry<>(root, 0));

    //     while (!queue.isEmpty()) {
    //         SimpleEntry<Node<Integer>,Integer> entry = queue.remove();
    //         Node<Integer> node = entry.getKey();
    //         int level = entry.getValue();

    //         if (level == list.size()) {
    //             List<Integer> newList = new ArrayList<>();
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

    //     list.stream().forEach(l -> {
    //         double average = l.stream().mapToDouble(d -> d).average().orElse(0.0);
    //         averageList.add(average);
    //     });

    //     return averageList;
    // }
    
    // Depth recursive
    public static List<Double> levelAverages(Node<Integer> root) {
        List<Double> averageList = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        levelAverages(root, 0, list);
        list.stream().forEach(l -> {
            double average = l.stream().mapToDouble(d -> d).average().orElse(0.0);
            averageList.add(average);
        });
        return averageList;
    }

    public static void levelAverages(Node<Integer> root, int level, List<List<Integer>> list) {
        
        if (root == null) {
            return;
        }

        if (level == list.size()) {
            List<Integer> newList = new ArrayList<>();
            newList.add(root.val);
            list.add(newList);
        } else {
            list.get(level).add(root.val);
        }

        levelAverages(root.left, level + 1, list);
        levelAverages(root.right, level + 1, list);
    }
}
