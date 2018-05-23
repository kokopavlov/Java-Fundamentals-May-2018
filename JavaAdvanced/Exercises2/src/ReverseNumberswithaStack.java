import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReverseNumberswithaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            stack.push(input[i]);
        }
        while (stack.size() > 0){
            System.out.print(stack.pop() + " ");
        }
    }
}
