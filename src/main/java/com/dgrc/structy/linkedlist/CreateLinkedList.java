package main.java.com.dgrc.structy.linkedlist;

import java.util.Arrays;
import java.util.List;

public class CreateLinkedList {

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
        Node<T> dummyNode = new Node<>(null);
        Node<T> current = dummyNode;
        for (T value : values) {
            current.next = new Node<T>(value);
            current = current.next;
        }
        return dummyNode.next;
    }
    
}
