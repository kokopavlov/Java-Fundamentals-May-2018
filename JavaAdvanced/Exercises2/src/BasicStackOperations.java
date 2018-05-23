import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Stream;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] commands = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();
        //number of elements to push onto the stack
        int N = commands[0];
        //number of elements to pop from the stack
        int S = commands[1];
        //check whether is present in the stack
        int X = commands[2];
        int[] elements = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            stack.push(elements[i]);
        }
        for (int i = 0; i < S; i++) {
            stack.pop();
        }
        boolean elementExists = false;
        if (stack.contains(X)){
            elementExists = true;
        }
        int smallestElement = Integer.MAX_VALUE;
        if (elementExists){
            System.out.println(elementExists);
        } else {
            if (!stack.isEmpty()){
                while (stack.size() > 0){
                    int temp = stack.pop();
                    if (temp < smallestElement){
                        smallestElement = temp;
                    }
                }
                System.out.println(smallestElement);
            } else {
                System.out.println(0);
            }
        }
    }
}
