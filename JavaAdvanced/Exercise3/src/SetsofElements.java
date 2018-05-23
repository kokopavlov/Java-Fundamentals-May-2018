import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sizes = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();
        Set<Integer> hashN = new LinkedHashSet<>();
        Set<Integer> hashM = new LinkedHashSet<>();
        for (int i = 0; i < sizes[0]; i++) {
            hashN.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < sizes[1]; i++) {
            hashM.add(Integer.parseInt(scanner.nextLine()));
        }
        Set<Integer> result = new LinkedHashSet<>();
        for (int numN:hashN
             ) {
            for (int numM:hashM
                 ) {
                if (numN == numM){
                    result.add(numN);
                }
            }
        }
        for (int num:result
             ) {
            System.out.print(num + " ");
        }
    }
}
