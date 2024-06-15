package main.java.com.dgrc.structy.linkedlist;

public class AddListsRecursive {

    public static void main(String[] args) {
        
        // // Test 1
        // //   621
        // // + 354
        // // -----
        // //   975
        // Node<Integer> a1 = new Node<>(1);
        // Node<Integer> a2 = new Node<>(2);
        // Node<Integer> a3 = new Node<>(6);
        // a1.next = a2;
        // a2.next = a3;
        // // 1 -> 2 -> 6
        // Node<Integer> b1 = new Node<>(4);
        // Node<Integer> b2 = new Node<>(5);
        // Node<Integer> b3 = new Node<>(3);
        // b1.next = b2;
        // b2.next = b3;
        // // 4 -> 5 -> 3
        // PrintLinkedList.print(addLists(a1, b1));
        // System.out.println("5 -> 7 -> 9");
        // // 5 -> 7 -> 9

        // // Test 2
        // //  7541
        // // +  32
        // // -----
        // //  7573
        // Node<Integer> a1 = new Node<>(1);
        // Node<Integer> a2 = new Node<>(4);
        // Node<Integer> a3 = new Node<>(5);
        // Node<Integer> a4 = new Node<>(7);
        // a1.next = a2;
        // a2.next = a3;
        // a3.next = a4;
        // // 1 -> 4 -> 5 -> 7
        // Node<Integer> b1 = new Node<>(2);
        // Node<Integer> b2 = new Node<>(3);
        // b1.next = b2;
        // // 2 -> 3 
        // PrintLinkedList.print(addLists(a1, b1));
        // System.out.println("3 -> 7 -> 5 -> 7");
        // // 3 -> 7 -> 5 -> 7

        // Test 3
        //   39
        // + 47
        // ----
        //   86
        Node<Integer> a1 = new Node<>(9);
        Node<Integer> a2 = new Node<>(3);
        a1.next = a2;
        // 9 -> 3
        Node<Integer> b1 = new Node<>(7);
        Node<Integer> b2 = new Node<>(4);
        b1.next = b2;
        // 7 -> 4
        
        var result = addLists(a1, b1);
        var expected = "6 -> 8";
        PrintLinkedList.print(result);
        System.out.println("Expected: " + expected);
        // 6 -> 8
    }
    
    public static Node<Integer> addLists(Node<Integer> head1, Node<Integer> head2) {
        
        return addLists(head1, head2, 0);
    }

    public static Node<Integer> addLists(Node<Integer> head1, Node<Integer> head2, int carry) {
        
        if (head1 == null && head2 == null && carry == 0) {
            return null;
        }
        int val1 = head1 == null ? 0 : head1.val;
        int val2 = head2 == null ? 0 : head2.val;
        int sum = val1 + val2 + carry;
        int carryNext = sum > 9 ? 1 : 0;
        int digit = sum % 10;
        Node<Integer> newNode = new Node<>(digit);
        Node<Integer> head1Next = head1 == null ? null : head1.next;
        Node<Integer> head2Next = head2 == null ? null : head2.next;
        newNode.next = addLists(head1Next, head2Next, carryNext);
        return newNode;

    }

}
