import java.util.Scanner;

public class FilltheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int dimension = Integer.parseInt(input[0]);
        String method = input[1];
        int[][] matrix = new int[dimension][dimension];
        int counter = 1;
        switch (method){
            case "A":
                FillColunsTopToBottm(dimension, matrix, counter);
                break;
            case  "B":
                FillColumnsTopToBottomThenBottomToTop(dimension, matrix, counter);
                break;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void FillColumnsTopToBottomThenBottomToTop(int dimension, int[][] matrix, int counter) {
        for (int col = 0; col < dimension; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < dimension; row++) {
                    matrix[row][col] = counter;
                    counter++;
                }
            } else {
                for (int row = dimension - 1; row >= 0; row--) {
                    matrix[row][col] = counter;
                    counter++;
                }
            }
        }
    }

    private static void FillColunsTopToBottm(int dimension, int[][] matrix, int counter) {
        for (int col = 0; col < dimension; col++) {
            for (int row = 0; row < dimension; row++) {
                matrix[row][col] = counter;
                counter++;
            }
        }
    }
}
