package structy.linkedlist;

public class ZipperLists {

    public static void main(String[] args) {

      // Test 1
      // a -> b -> c
      // x -> y -> z
      // a -> x -> b -> y -> c -> z
      // Node<String> a = new Node<>("a");
      // Node<String> b = new Node<>("b");
      // Node<String> c = new Node<>("c");
      // a.next = b;
      // b.next = c;
      // Node<String> x = new Node<>("x");
      // Node<String> y = new Node<>("y");
      // Node<String> z = new Node<>("z");
      // x.next = y;
      // y.next = z;
      // Node<String> head = zipperLists(a, x);
      // String print = head.val;
      // while (head.next != null) {
      //   print = print + " -> " + head.next.val ;
      //   head = head.next;
      // }
      // System.out.println(print);

      // Test 2
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
      Node<String> x = new Node<>("x");
      Node<String> y = new Node<>("y");
      Node<String> z = new Node<>("z");
      x.next = y;
      y.next = z;
      // x -> y -> z
      // a -> x -> b -> y -> c -> z -> d -> e -> f
      Node<String> head = zipperLists(a, x);
      String print = head.val;
      while (head.next != null) {
        print = print + " -> " + head.next.val ;
        head = head.next;
      }
      System.out.println(print);

    }

    public static <T> Node<T> zipperLists(Node<T> head1, Node<T> head2) {
        Node<T> head = head1;
        Node<T> current = head;
        Node<T> current1 = head1.next;
        Node<T> current2 = head2;
        int count = 1;
        while (current1 != null && current2 != null) {
          if (count % 2 == 0) {
            current.next = current1;
            current1 = current1.next;
          } else {
            current.next = current2;
            current2 = current2.next;
          }
          count++;
          current = current.next;
        }
        if (current1 != null) {
          current.next = current1;
        }
        if (current2 != null) {
          current.next = current2;
        }
        return head;
    }

    static class Node<T> {
        T val;
        Node<T> next;
        
        public Node(T val) {
          this.val = val;
          this.next = null;
        }
      }
    
}
