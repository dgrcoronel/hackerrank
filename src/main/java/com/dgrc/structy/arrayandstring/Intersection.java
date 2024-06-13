package main.java.com.dgrc.structy.arrayandstring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {

    public static void main(String[] args) {

        System.out.println(intersection(List.of(4,2,1,6), List.of(3,6,9,2,10)));
        System.out.println(intersection(List.of(2,4,6), List.of(4,2)));

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 60000; i += 1) {
        a.add(i);
        b.add(i);
        }
        intersection(a, b);
        intersection2(a, b);
        
    }

    public static List<Integer> intersection(List<Integer> listA, List<Integer> listB) {
        
        Set<Integer> set = new HashSet<>(listA);
        List<Integer> list = new ArrayList<>();

        long initial = System.currentTimeMillis();

        for (Integer number : listB) {
            if (set.contains(number)) {
                list.add(number);
            }
        }

        System.out.println("\nSet search: " + (System.currentTimeMillis() - initial) + " ms to execute");

        return list;
    }

    public static List<Integer> intersection2(List<Integer> listA, List<Integer> listB) {
        
        List<Integer> list = new ArrayList<>();

        long initial2 = System.currentTimeMillis();

        for (Integer number : listB) {
            if (listA.contains(number)) {
                list.add(number);
            }
        }

        System.out.println("List search: " + (System.currentTimeMillis() - initial2) + " ms to execute");

        return list;
  }
    
}
