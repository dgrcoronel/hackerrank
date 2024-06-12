package hackerrank;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCakeCandles {

    public static void main(String[] args) throws Exception {
        
        System.out.println(birthdayCakeCandles(Arrays.asList(4,4,1,3)));
        
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
        int tallest = 0;
        Map<Integer, Integer> sum = new HashMap<>();
        for (Integer candle : candles) {
            if (candle > tallest) {
                tallest = candle;
            }
            sum.put(candle, sum.getOrDefault(candle, 0) + 1);
        }
        return sum.get(tallest);
    }
}
