import java.util.Scanner;
import java.util.stream.Stream;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Stream.of(scanner.nextLine().split("\\s+"))
                .mapToInt(x -> Integer.parseInt(x))
                .toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] values = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = values[col];
            }
        }
        String command = scanner.nextLine();
        while (!"END".equals(command)){
            String[] tokens = command.split("\\s+");
            try{
                if ("swap".equals(tokens[0])){
                    int row1 = Integer.parseInt(tokens[1]);
                    int col1 = Integer.parseInt(tokens[2]);
                    int row2 = Integer.parseInt(tokens[3]);
                    int col2 = Integer.parseInt(tokens[4]);
                    String temp = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = temp;
                    for (int row = 0; row < matrix.length; row++) {
                        for (int col = 0; col < matrix[row].length; col++) {
                            System.out.print(matrix[row][col] + " ");
                        }
                        System.out.println();
                    }
                }else {
                    throw new Exception();
                }
            }
            catch (Exception e){
                System.out.println("Invalid input!");
            }

            command = scanner.nextLine();
        }
    }
}
