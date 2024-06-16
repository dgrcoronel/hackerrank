package com.dgrc.structy.linkedlist;

public class MergeListsRecursive {

    public static void main(String[] args) {

        Node<Integer> a = new Node<>(5);
        Node<Integer> b = new Node<>(7);
        Node<Integer> c = new Node<>(10);
        Node<Integer> d = new Node<>(12);
        Node<Integer> e = new Node<>(20);
        Node<Integer> f = new Node<>(28);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 5 -> 7 -> 10 -> 12 -> 20 -> 28
        Node<Integer> q = new Node<>(6);
        Node<Integer> r = new Node<>(8);
        Node<Integer> s = new Node<>(9);
        Node<Integer> t = new Node<>(25);
        q.next = r;
        r.next = s;
        s.next = t;
        // 6 -> 8 -> 9 -> 25
        // mergeLists(a, q);
        // 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 12 -> 20 -> 25 -> 28 
        Node<Integer> head = mergeLists(a, q);
        System.out.println(head);
        String print = head.val.toString();
        while (head.next != null) {
            print = print + " -> " + head.next.val ;
            head = head.next;
        }
        System.out.println(print);
            
    }

    public static Node<Integer> mergeLists(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        if (head1.val < head2.val) {
            head1.next = mergeLists(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeLists(head1, head2.next);
            return head2;
        }
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
