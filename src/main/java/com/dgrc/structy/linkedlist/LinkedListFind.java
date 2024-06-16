package com.dgrc.structy.linkedlist;

public class LinkedListFind {

    public static void main(String[] args) {

        // Test 1
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(linkedListFind(a, "c"));
        System.out.println(linkedListFindRecursive(a, "c"));

        // Test 2
        Node<String> node1 = new Node<>("jason");
        Node<String> node2 = new Node<>("leneli");
        node1.next = node2;
        System.out.println(linkedListFind(node1, "jason"));
        System.out.println(linkedListFindRecursive(node1, "jason"));

        // Test 3
        Node<Integer> nodeInt = new Node<>(42);
        System.out.println(linkedListFind(nodeInt, 42));
        System.out.println(linkedListFindRecursive(nodeInt, 42));

        // Test 4
        Node<Integer> nodeInt2 = new Node<>(42);
        System.out.println(linkedListFind(nodeInt, 100));
        System.out.println(linkedListFindRecursive(nodeInt, 100));


    }

    public static <T> boolean linkedListFind(Node<T> head, T target) {
        Node<T> current = head;
        while (current != null) {
            if (current.val == target) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static <T> boolean linkedListFindRecursive(Node<T> head, T target) {
        if (head == null) {
            return false;
        }
        if (head.val == target) {
            return true;
        }
        return linkedListFindRecursive(head.next, target);
    }

}
