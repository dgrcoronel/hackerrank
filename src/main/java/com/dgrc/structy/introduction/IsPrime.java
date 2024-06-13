package main.java.com.dgrc.structy.introduction;
public class IsPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(7));
        System.out.println(isPrime(10));

    }
    

    public static boolean isPrime(int number) {
        if (number < 2) {
           return false;
        }
        for (int i=2; i<=Math.sqrt(number); i++) {
          if (number % i == 0) {
            return false;
          }
        }
        return true;
      }
    
}
