package structy.arrayandstring;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentChar {

    public static void main(String[] args) {

        System.out.println(mostFrequentChar("bookeeper"));
        System.out.println(mostFrequentChar("david"));
        System.err.println(mostFrequentChar("abby"));
        System.out.println(mostFrequentChar("mississippi"));
        
    }

    public static char mostFrequentChar(String s) {

        Map<Character, Integer> count = countChar(s);
        char mostFrequent = s.charAt(0);
        
        for (char c : s.toCharArray()) {
            if (count.get(c) > count.get(mostFrequent)) {
                mostFrequent = c;
            }
        }
            
        return mostFrequent;
    }

    public static Map<Character, Integer> countChar (String s) {

        Map<Character, Integer> count = new HashMap<>();

        for (Character c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        return count;
    }
    
}
