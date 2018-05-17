import java.util.Scanner;
import java.util.stream.Stream;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String longerWord;
        String shorterWord;
        int sum = 0;
        if (firstWord.length() > secondWord.length()){
            longerWord = firstWord;
            shorterWord = secondWord;
        } else {
            longerWord = secondWord;
            shorterWord = firstWord;
        }

        for (int i = 0; i < longerWord.length(); i++) {
            if (shorterWord.length() > i){
                sum += longerWord.charAt(i) * shorterWord.charAt(i);
            } else {
                sum += longerWord.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
