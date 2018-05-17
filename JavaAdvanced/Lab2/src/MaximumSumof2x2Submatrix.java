import java.util.Scanner;
import java.util.stream.Stream;

public class MaximumSumof2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Stream.of(scanner.nextLine().split(", ")).mapToInt(x -> Integer.parseInt(x)).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] values = Stream.of(scanner.nextLine().split(", ")).mapToInt(x -> Integer.parseInt(x)).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = values[col];
            }
        }
        int bestSum = Integer.MIN_VALUE;
        int sum = 0;
        int[][] matrixToPrint = new int[2][2];
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > bestSum){
                    bestSum = sum;
                    matrixToPrint[0][0] = matrix[row][col];
                    matrixToPrint[0][1] = matrix[row][col + 1];
                    matrixToPrint[1][0] = matrix[row + 1][col];
                    matrixToPrint[1][1] = matrix[row + 1][col + 1];
                }
            }
        }
        for (int[] row: matrixToPrint
             ) {
            for (int col: row
                 ) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println(bestSum);
    }
}
