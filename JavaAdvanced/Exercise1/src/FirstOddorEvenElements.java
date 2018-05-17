import java.util.Scanner;
import java.util.stream.Stream;

public class FirstOddorEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();
        String[] tokens = scanner.nextLine().split("\\s+");
        int count = Integer.parseInt(tokens[1]);
        int oddeven = -1;
        if ("odd".equals(tokens[2])){
            oddeven = 1;
        } else if ("even".equals(tokens[2])) {
            oddeven = 0;
        }
        int[] foundNums = new int[count];
        int foundCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (foundNums.length > foundCounter){
                if (nums[i] % 2 == oddeven){
                    foundNums[foundCounter] = nums[i];
                    foundCounter++;
                }
            }
        }
        String output = "";
        for (int i = 0; i < foundNums.length; i++) {
            if (i < foundCounter) {
                output += foundNums[i] + " ";
            }
        }
        output = output.trim();
        System.out.print(output);
    }
}
