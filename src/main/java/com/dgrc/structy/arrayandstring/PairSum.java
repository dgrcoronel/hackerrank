package com.dgrc.structy.arrayandstring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairSum {

    public static void main(String[] args) {

        // 3:0
        // 2:1
        System.out.println(pairSum(List.of(3, 2, 5, 4, 1), 8));
        System.out.println(pairSum(List.of(4, 7, 9, 2, 5, 1), 5));
        System.err.println(pairSum(List.of(4, 7, 9, 2, 5, 1), 3));
        
    }

    public static List<Integer> pairSum(List<Integer> numbers, int target) {

        Map<Integer, Integer> num = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++) {
            int numToFind = target - numbers.get(i);
            if (num.containsKey(numToFind)) {
                return List.of(num.get(numToFind), i);
            }
            num.put(numbers.get(i), i);
        }
        return List.of();

    }
    
}
