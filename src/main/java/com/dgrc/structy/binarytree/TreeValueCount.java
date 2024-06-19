package com.dgrc.structy.binarytree;

public class TreeValueCount {

    public static void main(String[] args) {

        // Test 1
        Node<Integer> a = new Node<>(12);
        Node<Integer> b = new Node<>(6);
        Node<Integer> c = new Node<>(6);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(6);
        Node<Integer> f = new Node<>(12);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        //      12
        //    /   \
        //   6     6
        //  / \     \
        // 4   6     12
        System.out.println(treeValueCount(a,  6)); // -> 3
        
    }

    public static <T> int treeValueCount(Node<T> root, T target) {
        
        if (root == null) {
            return 0;
        }

        int count = root.val == target ? 1 : 0;

        return count + treeValueCount(root.left, target) + treeValueCount(root.right, target);
    }

    // public static <T> int treeValueCount(Node<T> root, T target) {
        
    //     if (root == null) {
    //         return 0;
    //     }

    //     int count = 0;
    //     Stack<Node<T>> stack = new Stack<>();
    //     stack.add(root);

    //     while (!stack.isEmpty()) {
    //         Node<T> node = stack.remove(count);
    //         if (node.val == target) {
    //             count++;
    //         }
    //         if (root.left != null) {
    //             stack.add(node.left)
    //         }
    //         if (root.right != null) {
    //             stack.add(node.right);
    //         }
    //     }

    //     return count;
    // }    
    
}
