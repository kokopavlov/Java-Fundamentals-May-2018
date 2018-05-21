import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> player1 = new LinkedHashSet<>();
        Set<Integer> player2 = new LinkedHashSet<>();
        int[] player1input = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();
        int[] player2input = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(x -> Integer.parseInt(x)).toArray();
        FillSet(player1, player1input);
        FillSet(player2, player2input);

        for (int i = 0; i < 50; i++) {
            if (player1.isEmpty()){
                System.out.println("Second player win!");
                return;
            } else if (player2.isEmpty()){
                System.out.println("First player win!");
                 return;
            } else {
                int firstPlayerCard = player1.iterator().next();
                player1.remove(firstPlayerCard);
                int secondPlayerCard = player2.iterator().next();
                player2.remove(secondPlayerCard);
                if (firstPlayerCard > secondPlayerCard){
                    player1.add(firstPlayerCard);
                    player1.add(secondPlayerCard);

                } else if (secondPlayerCard > firstPlayerCard){
                    player2.add(firstPlayerCard);
                    player2.add(secondPlayerCard);

                }
            }
        }
        if (player1.size() > player2.size()){
            System.out.println("First player win!");
        } else if (player2.size() > player1.size()){
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }

    private static void FillSet(Set<Integer> player1, int[] player1input) {
        for (int i = 0; i < player1input.length; i++) {
            player1.add(player1input[i]);
        }
    }
}
