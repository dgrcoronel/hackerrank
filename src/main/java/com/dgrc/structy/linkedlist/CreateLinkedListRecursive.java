package com.dgrc.structy.linkedlist;

import java.util.Arrays;
import java.util.List;

public class CreateLinkedListRecursive {

    public static void main(String[] args) {

        // Test 1
        PrintLinkedList.print(createLinkedList(List.of("h", "e", "y")));
        System.out.println("h -> e -> y");
        // h -> e -> y

        // Teste 2
        PrintLinkedList.print(createLinkedList(List.of(1, 7, 1, 8)));
        System.out.println("1 -> 7 -> 1 -> 8");

        // Teste 3
        PrintLinkedList.print(createLinkedList(List.of("a")));
        System.out.println("a");

        // Teste 4
        System.out.println(Arrays.asList(createLinkedList(List.of())));
        System.out.println("null");
        
    }

    public static <T> Node<T> createLinkedList(List<T> values) {
        return createLinkedList(values, 0);
    }

    public static <T> Node<T> createLinkedList(List<T> values, int i) {
        if (i == values.size()) {
            return null;
        }

        Node<T> head = new Node<T>(values.get(i));
        head.next = createLinkedList(values, i+1);
        
        return head;
        
    }

    // public static <T> Node<T> createLinkedList(List<T> values) {
    //     Node<T> head = values.isEmpty() ? new Node<>(null) : new Node<>(values.get(0));
    //     return createLinkedList(values, head);
    // }

    // public static <T> Node<T> createLinkedList(List<T> values, Node<T> head) {
    //     if (values.isEmpty()) {
    //         return null;
    //     }
    //     if (values.size() == 1) {
    //         return head;
    //     }
    //     values = values.subList(1, values.size());
    //     head.next = createLinkedList(values, new Node<T>(values.get(0)));
    //     return head;
    // }
    
}
