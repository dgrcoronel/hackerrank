package main.java.com.dgrc.structy.linkedlist;

public class GetNodeValue {

    public static void main(String[] args) {

        // Test 1
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(getNodeValue(a, 2)); // "c"
        System.out.println(getNodeValueRecursive(a, 2));

        // Test 2
        Node<String> node1 = new Node<>("banana");
        Node<String> node2 = new Node<>("mango");
        node1.next = node2;
        System.out.println(getNodeValue(node1, 0)); // "banana"
        System.out.println(getNodeValueRecursive(node1, 0));

    }

    public static <T> T getNodeValue(Node<T> head, int index) {
        Node<T> current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.val;
            }
            current = current.next;
            count++;
        }
        return null;
    }

    public static <T> T getNodeValueRecursive(Node<T> head, int index) {
        if (head == null) {
            return null;
        }
        if (index == 0) {
            return head.val;
        }
        return getNodeValueRecursive(head.next, index - 1);
    }

}
