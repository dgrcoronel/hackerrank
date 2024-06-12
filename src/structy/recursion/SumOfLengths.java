package structy.recursion;

import java.util.List;

public class SumOfLengths {

    public static void main(String[] args) {

        System.out.println(sumOfLengths(List.of("goat", "cat", "purple")));
        System.out.println(sumOfLengths(List.of("bike", "at", "pencils", "phone")));
        
    }

    public static int sumOfLengths(List<String> strings) {
        if (strings.isEmpty()) {
            return 0;
        }
        return strings.get(0).length() + sumOfLengths(strings.subList(1, strings.size()));
    }
    
}
