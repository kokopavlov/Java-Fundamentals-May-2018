import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Stream;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();
        //number of elements to enqueue
        int N = input[0];
        //number of elements to dequeue
        int S = input[1];
        //check whether is present in the queue
        int X = input[2];
        int[] elements = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            queue.offer(elements[i]);
        }
        for (int i = 0; i < S; i++) {
            queue.poll();
        }
        if (queue.contains(X)){
            System.out.println("true");
        } else {
            if (!queue.isEmpty()){
                int smallestElement = Integer.MAX_VALUE;
                while (queue.size() > 0){
                    int temp = queue.poll();
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
