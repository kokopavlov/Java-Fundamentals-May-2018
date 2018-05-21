import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class CountSameValuesinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersArr = scanner.nextLine().split("\\s+");
        Map<String, Integer> numbersMap = new HashMap<>();
        for (int i = 0; i < numbersArr.length; i++) {
            if (!numbersMap.containsKey(numbersArr[i])){
                numbersMap.put(numbersArr[i], 0);
            }
            numbersMap.put(numbersArr[i], numbersMap.get(numbersArr[i]) + 1);
        }
        for (String number: numbersMap.keySet()
             ) {
            System.out.printf("%s - %d times%n", number, numbersMap.get(number));
        }
    }
}
