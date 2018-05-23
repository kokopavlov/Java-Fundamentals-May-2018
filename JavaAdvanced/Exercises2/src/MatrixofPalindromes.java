import java.util.Scanner;
import java.util.stream.Stream;

public class MatrixofPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tokens = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();
        int rows = tokens[0];
        int cols = tokens[1];
        String[][] matrix = new String[rows][cols];

        FillPalindromesInMatrix(rows, cols, matrix);

        PrintMatrixToConsole(matrix);
    }

    private static void PrintMatrixToConsole(String[][] matrix) {
        for (String[] row:matrix
             ) {
            for (String col: row
                 ) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static void FillPalindromesInMatrix(int rows, int cols, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                String palindrome = "";
                char outerLetter = (char)(row + 97);
                palindrome += outerLetter;
                char middleLetter = (char)(row + col + 97);
                palindrome += middleLetter;
                palindrome += outerLetter;
                matrix[row][col] = palindrome;
            }
        }
    }
}
