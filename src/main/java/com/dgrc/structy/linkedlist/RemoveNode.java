package main.java.com.dgrc.structy.linkedlist;

public class RemoveNode {

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
        var head = removeNode(a, "c");
        // a -> b -> d -> e -> f
        String print = head.val.toString();
        while (head.next != null) {
            print = print + " -> " + head.next.val ;
            head = head.next;
        }
        System.out.println(print);
    }

    public static <T> Node<T> removeNode(Node<T> head, T targetVal) {
        if (head.val == targetVal) {
            return head.next;
        }
        Node<T> current = head;
        Node<T> previous = null;
        while (current != null) {
            if (current.val == targetVal) {
                previous.next = current.next;
                break;
            }
            previous = current;
            current = current.next;
        }
        return head;

      }
    
}
