import java.util.Scanner;
import java.util.stream.Stream;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tokens = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();
        int rows = tokens[0];
        int cols = tokens[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] values = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = values[col];
            }
        }
        int bestSum = Integer.MIN_VALUE;
        int[][] bestMatrix = new int[3][3];
        int sum = 0;
        for (int row = 0; row < matrix.length  -2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2] +
                        matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                if (sum > bestSum){
                    bestSum = sum;
                    bestMatrix[0][0] = matrix[row][col];
                    bestMatrix[0][1] = matrix[row][col + 1];
                    bestMatrix[0][2] = matrix[row][col + 2];
                    bestMatrix[1][0] = matrix[row + 1][col];
                    bestMatrix[1][1] = matrix[row + 1][col + 1];
                    bestMatrix[1][2] = matrix[row + 1][col + 2];
                    bestMatrix[2][0] = matrix[row + 2][col];
                    bestMatrix[2][1] = matrix[row + 2][col + 1];
                    bestMatrix[2][2] = matrix[row + 2][col + 2];
                }
            }
        }
        System.out.println("Sum = " + bestSum);
        for (int[] row: bestMatrix
             ) {
            for (int col: row
                 ) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
