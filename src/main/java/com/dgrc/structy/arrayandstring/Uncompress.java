package main.java.com.dgrc.structy.arrayandstring;


public class Uncompress {

    public static void main(String[] args) {

        System.out.println(uncompress("2c3a1t"));
        System.out.println(uncompress("3n12e2z"));
        System.out.println(uncompress("127y"));
        
    }

    public static String uncompress(String s) {
        String output = "";
        String numbers = "0123456789";
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            // String character = String.valueOf(s.charAt(j));
            String character = s.substring(j, j + 1);
            if (numbers.contains(character)) {
                j++;
            } else {
                int number = Integer.parseInt(s.substring(i, j));
                output += character.repeat(number);
                j++;
                i = j;
            }
        }
        return output;
    }
    
}
