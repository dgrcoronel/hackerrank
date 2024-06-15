package main.java.com.dgrc.structy.linkedlist;

public class AddLists {

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
        PrintLinkedList.print(addLists(a1, b1));
        System.out.println("6 -> 8");
        // 6 -> 8
    }
    
    public static Node<Integer> addLists(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> dummyHead = new Node<>(null);
        Node<Integer> current = dummyHead;
        Node<Integer> current1 = head1;
        Node<Integer> current2 = head2;
        int carry = 0;

        while (current1 != null || current2 != null || carry > 0) {
            int value1 = current1 == null ? 0 : current1.val;
            int value2 = current2 == null ? 0 : current2.val;
            int sum = value1 + value2 + carry;
            int digit = sum % 10;
            // System.out.println("sum: " + sum);
            carry = sum > 9 ? 1 : 0;
            // System.out.println("newCarry: " + newCarry);
            Node<Integer> newNode = new Node<>(digit);
            current.next = newNode;
            current1 = current1 == null ? null : current1.next;
            current2 = current2 == null ? null : current2.next;
            current = current.next;
        }

        return dummyHead.next;
    }

}
