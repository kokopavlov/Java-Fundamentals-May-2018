import java.util.Scanner;

public class XBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 8, cols = 32;
        char[][] matrix = new char [rows][cols];
        for (int i = 0; i < 8; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            String binary = Integer.toBinaryString(number);
            int charsToFill = cols - binary.length();
            for (int j = 0; j < charsToFill; j++) {
               binary = '0' + binary;
            }
            matrix[i] = binary.toCharArray();
        }
        int countXBits = 0;
        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                if (matrix[row][col] == '1'){
                    if (isValidXBit(matrix, row, col)){
                        countXBits++;
                    }
                }
            }
        }
        System.out.println(countXBits);
    }

    private static boolean isValidXBit(char[][] matrix, int row, int col) {
        boolean isValid = false;

        if (matrix[row][col] == '1' && matrix[row][col + 1] == '0' && matrix[row][col + 2] == '1'){
            if (matrix[row + 1][col] == '0' && matrix[row + 1][col + 1] == '1' && matrix[row + 1][col + 2] == '0') {
                if (matrix[row+ 2][col] == '1' && matrix[row + 2][col + 1] == '0' && matrix[row + 2][col + 2] == '1'){
                    isValid = true;
                }
            }
        }
        return  isValid;
    }
}
