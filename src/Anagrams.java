import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    public static void main(String[] args) {

        System.out.println(anagrams("restful", "fluster"));
        System.out.println(anagrams("cats", "tocs"));
        System.out.println(anagrams("monkeyswrite", "newyorktimes"));
        
    }

    public static boolean anagrams(String s1, String s2) {
        
        return charCount(s1).equals(charCount(s2));

      }

    public static Map<Character, Integer> charCount (String s) {

        Map<Character, Integer> count = new HashMap<>();

        for (char c : s.toCharArray()) {
            int value = count.getOrDefault(c, 0) + 1;
            count.put(c, value);
        }

        return count;

    }
    
}
