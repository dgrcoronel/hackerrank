package structy;

public class SumList {

    public static void main(String[] args) {

        // Test 1
        Node<Integer> x = new Node<>(38);
        Node<Integer> y = new Node<>(4);
        x.next = y;
        System.out.println(sumList(x));
        System.out.println(sumListRecursive(x));

        // Test 2
        Node<Integer> z = new Node<>(100);
        System.out.println(sumList(z));
        System.out.println(sumListRecursive(z));

        // Test 3
        System.err.println(sumList(null));
        System.err.println(sumListRecursive(null));


    }

    public static int sumList(Node<Integer> head) {
        int sum = 0;
        Node<Integer> current = head;
        while (current != null) {
            sum += current.val;
            current = current.next;
        }
        return sum;
      }

      public static int sumListRecursive(Node<Integer> head) {
        if (head == null) {
            return 0;
        }
        return head.val + sumListRecursive(head.next);
      }

    static class Node<T> {
        
        T val;
        Node<T> next;

        Node(T val) {
            this.val = val;
            this.next = null;
        }
    }
    
}
