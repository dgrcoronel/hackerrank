package structy.recursion;

public class Factorial {

    public static void main(String[] args) {

        System.err.println(factorial(3));
        System.out.println(factorial(6));
        
    }

    public static long factorial(int n) {
        
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }
    
}
