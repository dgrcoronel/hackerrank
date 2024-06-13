package main.java.com.dgrc.structy.arrayandstring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairProduct {

    public static void main(String[] args) {

        System.out.println(pairProduct(List.of(3, 2, 5, 4, 1), 8));
        System.out.println(pairProduct(List.of(3, 2, 5, 4, 1), 10));
        System.out.println(pairProduct(List.of(4, 7, 9, 2, 5, 1), 5));
        System.out.println(pairProduct(List.of(4, 7, 9, 2, 5, 1), 35));
        
    }

    public static List<Integer> pairProduct(List<Integer> numbers, int target) {
        
        Map<Double,Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            double numbToFind = target / num;
            if (map.containsKey(numbToFind)) {
                return List.of(map.get(numbToFind), i);
            }
            map.put(Double.valueOf(numbers.get(i)), i);
        }
        
        return List.of();

    }
    
}
