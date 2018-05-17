import java.util.Scanner;
import java.util.stream.Stream;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Stream.of(scanner.nextLine().split(", ")).mapToInt(x -> Integer.parseInt(x)).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = new int[rows][cols];
        int sum = 0;
        for (int row = 0; row < rows; row++) {
            int[] values = Stream.of(scanner.nextLine().split(", ")).mapToInt(x -> Integer.parseInt(x)).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = values[col];
            }
        }
        for (int[] row : matrix
             ) {
            for (int col : row
                 ) {
                sum+=col;
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
