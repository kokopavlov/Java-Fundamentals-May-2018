import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] resultArr = new int[number];
        for (int i = 0; i < number; i++) {
            int sum = getSum(scanner);
            resultArr[i] = sum;
        }
        Arrays.sort(resultArr);
        for (int i = 0; i < resultArr.length; i++) {
            System.out.println(resultArr[i]);
        }
    }

    private static int getSum(Scanner scanner) {
        String inputString = scanner.nextLine();
        char[] charArr = inputString.toCharArray();
        int sum = 0;
        for (int j = 0; j < charArr.length; j++) {
            if (charArr[j] == 'a' || charArr[j] == 'e' || charArr[j] == 'i' || charArr[j] == 'o' || charArr[j] == 'u' ||
                    charArr[j] == 'A' || charArr[j] == 'E' || charArr[j] == 'I' || charArr[j] == 'O' || charArr[j] == 'U'){
                sum += charArr[j] * charArr.length;
            } else {
                sum += charArr[j] / charArr.length;
            }
        }
        return sum;
    }
}
