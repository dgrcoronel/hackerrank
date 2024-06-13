package structy.linkedlist;

public class ReverseList {

    public static void main(String[] args) {
        // Teste 1
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
        // null -> a -> b -> c -> d -> e -> f
        //    p    c    n
        //         p    c    n
        //              p    c    n
        //                   p    c    n
        //                        p    c    n
        //                             p    c    n
        //                                  p    c    n
        System.out.println(reverseList(a));
        // System.out.println(reverseListRecursive(a));
        var response = reverseListRecursive(a);
        // f -> e -> d -> c -> b -> a
    }

    public static <T> Node<T> reverseList(Node<T> head) {
        Node<T> current = head;
        Node<T> previous = null;
        while (current != null) {
            Node<T> next = current.next;
            current.next = previous;
            System.out.println("current.next: " + current.next);
            previous = current;
            System.out.println("previous: " + previous);
            current = next;
            System.out.println("current: " + current);
        }
        return previous;
    }

    public static <T> Node<T> reverseListRecursive(Node<T> head) {
        return reverseListRecursive(head, null);
      }

    public static <T> Node<T> reverseListRecursive(Node<T> head, Node<T> prev) {
        if (head == null) {
          return prev;
        }
        Node<T> next = head.next;
        head.next = prev;
        return reverseListRecursive(next, head);
    }

    static class Node<T> {

        T val;
        Node<T> next;
        
        public Node(T val) {
          this.val = val;
          this.next = null;
        }

        @Override
        public String toString() {
            return val.toString();
        }

    }
    

}