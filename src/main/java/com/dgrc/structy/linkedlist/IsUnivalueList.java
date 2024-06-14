package main.java.com.dgrc.structy.linkedlist;

public class IsUnivalueList {

    public static void main(String[] args) {

        // Test 1
        // Node<Integer> a = new Node<>(7);
        // Node<Integer> b = new Node<>(7);
        // Node<Integer> c = new Node<>(7);
        // a.next = b;
        // b.next = c;
        // // 7 -> 7 -> 7
        // boolean isUni = isUnivalueList(a); // true
        // System.out.println(isUni);

        // Test 2
        Node<Integer> a = new Node<>(7);
        Node<Integer> b = new Node<>(7);
        Node<Integer> c = new Node<>(4);
        a.next = b;
        b.next = c;
        // 7 -> 7 -> 4
        boolean isUni = isUnivalueList(a); // false
        System.out.println(isUni);
        
    }

    public static <T> boolean isUnivalueList(Node<T> head) {
        Node<T> current = head;
        T value = head.val;

        while (current != null) {
            if (current.val != value) {
                return false;
            }
            current = current.next;
        }

        return true;

      }

}
