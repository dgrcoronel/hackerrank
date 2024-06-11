package structy;

public class PalindromeRecursive {

    public static void main(String[] args) {
        
        System.out.println(palindrome("pop"));
        System.out.println(palindrome("kayak"));
        System.err.println(palindrome("pops"));

    }

    public static boolean palindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return palindrome(s.substring(1, s.length() - 1));
    }
    
}
