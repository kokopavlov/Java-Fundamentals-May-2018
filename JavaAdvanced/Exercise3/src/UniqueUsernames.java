import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Set<String> hash = new LinkedHashSet<>();
        for (int i = 0; i < number; i++) {
            hash.add(scanner.nextLine());
        }
        for (String name:hash
             ) {
            System.out.println(name);
        }
    }
}
