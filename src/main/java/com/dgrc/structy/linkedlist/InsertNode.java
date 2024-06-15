package main.java.com.dgrc.structy.linkedlist;

public class InsertNode {

    public static void main(String[] args) {

        // // Test 1
        // Node<String> a = new Node<>("a");
        // Node<String> b = new Node<>("b");
        // Node<String> c = new Node<>("c");
        // Node<String> d = new Node<>("d");
        // a.next = b;
        // b.next = c;
        // c.next = d;
        // // a -> b -> c -> d
        // PrintLinkedList.print(insertNode(a, "x", 2));
        // System.out.println("a -> b -> x -> c -> d");
        // // a -> b -> x -> c -> d

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

        // Test 3
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        a.next = b;
        b.next = c;
        c.next = d;
        // a -> b -> c -> d
        PrintLinkedList.print(insertNode(a, "m", 4));
        System.out.println("a -> b -> c -> d -> m");
        // a -> b -> c -> d -> m
    }

    public static <T> Node<T> insertNode(Node<T> head, T value, int index) {
        Node<T> newNode = new Node<>(value);
        Node<T> current = head;
        int count = 2;
        if (index == 0) {
            newNode.next = head;
            return newNode;
        }
        while (current != null) {
            if (count - 1 == index) {
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
            count++;
        }

        return head;
      }
    
}
