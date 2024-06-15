package main.java.com.dgrc.structy.linkedlist;

public class PrintLinkedList {

    public static <T> void print(Node<T> head) {
        String print = head.val.toString();
        while (head.next != null) {
            print = print + " -> " + head.next.val ;
            head = head.next;
        }
        System.out.println(print);
    }
    
}
