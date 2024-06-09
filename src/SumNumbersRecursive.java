import java.util.List;

public class SumNumbersRecursive {

    public static void main(String[] args) {

        System.out.println(sumNumbersRecursive(List.of(5, 2, 9, 10)));
        
    }

    public static int sumNumbersRecursive(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        System.out.println(numbers);
        return numbers.get(0) + sumNumbersRecursive(numbers.subList(1, numbers.size()));
    }
    
}
