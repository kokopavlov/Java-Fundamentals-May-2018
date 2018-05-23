import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Stream;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numberOfCommands; i++) {
            int[] commands = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();
            int firstCommand = commands[0];
            int elementToPush = 0;
            if (firstCommand == 1){
                elementToPush = commands[1];
                stack.push(elementToPush);
            } else if (firstCommand == 2){
                stack.pop();
            } else if (firstCommand == 3){
                int maxElement = Integer.MIN_VALUE;
                ArrayDeque<Integer> copy = stack.clone();
                while (copy.size() > 0){
                    int temp = copy.pop();
                    if (temp > maxElement){
                        maxElement = temp;
                    }
                }
                System.out.println(maxElement);
            }
        }
    }
}
