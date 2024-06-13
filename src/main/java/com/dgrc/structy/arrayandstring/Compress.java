package main.java.com.dgrc.structy.arrayandstring;


public class Compress {

    public static void main(String[] args) {

        //                             012345678
        System.out.println(compress("ccaaatsss"));
        System.out.println(compress("ssssbbz"));
        
    }

    public static String compress(String s) {
        s += "!";
        String output = "";
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } else {
                int count = j - i;
                output = count > 1 ? output + count + s.charAt(i) : output + s.charAt(i);
                i = j;
            }
        }
        return output;
      }
    
}
