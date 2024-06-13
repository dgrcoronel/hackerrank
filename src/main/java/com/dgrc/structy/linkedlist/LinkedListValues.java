package main.java.com.dgrc.structy.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedListValues {

    public static void main(String[] args) {

        // test 1
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
        x.next = y;
        System.out.println(linkedListValues(x));
        System.out.println(linkedListValuesRecursive(x));

        // test 2
        Node<String> q = new Node<>("q");
        System.out.println(linkedListValues(q));
        System.out.println(linkedListValuesRecursive(x));
    }

    static class Node<T> {
        
        T val;
        Node<T> next;

        public Node(T val) {
            this.val = val;
            this.next = null;
        }

    }

    public static List<String> linkedListValues(Node<String> head) {
        Node<String> current = head;
        List<String> result = new ArrayList<>();
        while (current != null) {
            result.add(current.val);
            current = current.next;
        }
        return result;
    }

    public static List<String> linkedListValuesRecursive(Node<String> head) {
        List<String> result = new ArrayList<>();
        linkedListValuesRecursive(head, result);
        return result;
    }

    public static void linkedListValuesRecursive(Node<String> head, List<String> result) {
        if (head == null) {
            return;
        }
        result.add(head.val);
        linkedListValuesRecursive(head.next, result);
    }

}
