package main.java.com.dgrc.structy.linkedlist;

public class RemoveNodeRecursive {

    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // a -> b -> c -> d -> e -> f
        PrintLinkedList.print(removeNode(a, "c"));
        // a -> b -> d -> e -> f
    }

    public static <T> Node<T> removeNode(Node<T> head, T targetVal) {
        if (head.val == targetVal) {
            return head.next;
        }
        head.next = removeNode(head.next, targetVal);

        return head;
    }
    
}
