import java.util.Scanner;
import java.util.stream.Stream;

public class ByteParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = Integer.parseInt(input);
        int[] numArr = new int[count];
        for (int i = 0; i < count; i++) {
            input = scanner.nextLine();
            int num = Integer.parseInt(input);
            numArr[i] = num;
        }
        input = scanner.nextLine();
        while (!"party over".equals(input)){
            int[] command = Stream.of(input.split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();
            int position = command[1];
            switch (command[0]){
                case -1:
                    FlipBitAtPosition(numArr, position);
                    break;
                case 0:
                    SetBitToZeroAtPosition(numArr, position);
                    break;
                case 1:
                    SetBitToOneAtPosition(numArr, position);
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }
    }

    private static void SetBitToOneAtPosition(int[] numArr, int position) {
        for (int i = 0; i < numArr.length; i++) {
            int mask = 1 << position;
            numArr[i] = numArr[i] | mask;
        }
    }

    private static void SetBitToZeroAtPosition(int[] numArr, int position) {
        for (int i = 0; i < numArr.length; i++) {
            int mask = ~(1 << position);
            numArr[i] = numArr[i] & mask;
        }
    }

    private static void FlipBitAtPosition(int[] numArr, int position) {
        for (int i = 0; i < numArr.length; i++) {
            int mask = numArr[i] >> position;
            int lastBit = mask & 1;
            if (lastBit == 1){
                mask = ~(1 << position);
                numArr[i] = numArr[i] & mask;
            } else {
                mask = 1 << position;
                numArr[i] = numArr[i] | mask;
            }
        }
    }
}
