package main.java.com.dgrc.structy.linkedlist;

public class LongestStreak {

    public static void main(String[] args) {

        // 5 -> 5 -> 7 -> 7 -> 7 -> 6
        
    }

    public static <T> int longestStreak(Node<T> head) {
        Node<T> current = head;
        int currentStreak = 0;
        int longestStreak = 0;
        T prevVal = null;

        while (current != null) {
            if (prevVal == current.val) {
                currentStreak++;
            } else {
                currentStreak = 1;
            }
            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
            }
            prevVal = current.val;
            current = current.next;
        }

        return longestStreak;
    }

    
}
