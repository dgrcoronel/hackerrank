package com.dgrc.structy.linkedlist;

public class InsertNodeRecursive {

    public static void main(String[] args) {

        // Test 1
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        a.next = b;
        b.next = c;
        c.next = d;
        // a -> b -> c -> d
        // 0    1    2    3
        // 2    1    0
        PrintLinkedList.print(insertNode(a, "x", 2));
        System.out.println("a -> b -> x -> c -> d");
        // a -> b -> x -> c -> d

        // // Test 2
        // Node<String> a = new Node<>("a");
        // Node<String> b = new Node<>("b");
        // Node<String> c = new Node<>("c");
        // Node<String> d = new Node<>("d");
        // a.next = b;
        // b.next = c;
        // c.next = d;
        // // a -> b -> c -> d
        // PrintLinkedList.print(insertNode(a, "m", 4));
        // System.out.println("a -> b -> c -> d -> m");
        // // a -> b -> c -> d -> m
    }

    // a -> b -> c -> d
    // 0    1    2    3
    // 2    1    0
    // a -> b -> x -> c -> d
    public static <T> Node<T> insertNode(Node<T> head, T value, int index) {
        if (head.val == value) {
            Node<T> newNode = new Node<>(value);
            newNode.next = head;
            return newNode;
        }
        if (index == 1) {
            Node<T> newNode = new Node<>(value);
            newNode.next = head.next;
            head.next = newNode;
            return head;
        }
        head.next = insertNode(head.next, value, index - 1);

        return head;
    }

}
