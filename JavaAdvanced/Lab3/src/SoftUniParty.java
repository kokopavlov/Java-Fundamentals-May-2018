import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> guestsInvited = new TreeSet<>();

        String input;

        while (!"PARTY".equals(input = scanner.nextLine())){
            guestsInvited.add(input);
        }
        while(!"END".equals(input = scanner.nextLine())){
            guestsInvited.remove(input);
        }
        System.out.println(guestsInvited.size());
        for (String guest:guestsInvited
             ) {
            System.out.println(guest);
        }
    }
}
