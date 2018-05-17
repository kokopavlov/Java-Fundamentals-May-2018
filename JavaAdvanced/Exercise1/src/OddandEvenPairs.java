import java.util.Scanner;
import java.util.stream.Stream;

public class OddandEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();

        if (nums.length % 2 == 0) {
            for (int i = 0; i < nums.length - 1; i+=2) {
                String check;
                if (nums[i]%2 != nums[i + 1]%2){
                    check = "different";
                }
                else if (nums[i]%2 == 0){
                    check = "both are even";
                }
                else {
                    check = "both are odd";
                }
                System.out.printf("%d, %d -> %s", nums[i], nums[i + 1], check);
                System.out.println();
            }
        } else {
            System.out.println("invalid length");
        }

    }
}
