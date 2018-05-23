import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Set<String> treeHash = new TreeSet<>();
        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int j = 0; j < input.length; j++) {
                treeHash.add(input[j]);
            }
        }
        for (String element:treeHash
             ) {
            System.out.print(element + " ");
        }
    }
}
