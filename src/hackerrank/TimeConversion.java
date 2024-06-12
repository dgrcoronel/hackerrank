package hackerrank;
public class TimeConversion {

    public static void main(String[] args) {
        
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("12:40:22AM"));
        System.out.println(timeConversion("06:40:03AM"));


    }
    
    public static String timeConversion(String s) {
        // Write your code here
        int hour = Integer.parseInt(s.substring(0, 2));
        String minuteSecond = s.substring(2, 8);
        String time = s.substring(8, 10);
        StringBuilder str = new StringBuilder();

       if (hour < 12 && time.equals("PM")) {
            hour += 12;
        } 

        if (hour < 12 && time.equals("AM")) {
            str.append("0");
        } 

        if (hour == 12 && time.equals("AM")) {
            hour -= 12;
            str.append("0");
        }

        
        str.append(hour);
        str.append(minuteSecond);

        return str.toString();
    
    }
}
