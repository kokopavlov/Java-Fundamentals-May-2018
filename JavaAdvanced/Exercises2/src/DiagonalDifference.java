import com.sun.imageio.plugins.common.I18N;

import java.util.Scanner;
import java.util.stream.Stream;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            int[] tokens = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();
            for (int col = 0; col < size; col++) {
                matrix[row][col] = tokens[col];
            }
        }
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        for (int row = 0; row < matrix.length; row++) {
            primaryDiagonal += matrix[row][row];
            secondaryDiagonal += matrix[row][matrix.length - 1 - row];
        }
        System.out.println(Math.abs(primaryDiagonal - secondaryDiagonal));
    }
}
