import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitbyWordCasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("[.!,/()'\\\\\";:\\[\\] ]+");
        List<String> lowerCase = new ArrayList<>();
        List<String> upperCase = new ArrayList<>();
        List<String> mixedCase = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            int lowerCount = 0;
            int upperCount = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (Character.isLowerCase(words[i].charAt(j))) {
                    lowerCount++;
                }
                if (Character.isUpperCase(words[i].charAt(j))) {
                    upperCount++;
                }
            }
            if (words[i].length() == lowerCount) {
                lowerCase.add(words[i]);
            } else if (words[i].length() == upperCount){
                upperCase.add(words[i]);
            } else {
                mixedCase.add(words[i]);
            }
        }
        System.out.print("Lower-case: ");
        for (int i = 0; i < lowerCase.size(); i++) {
            if (i < lowerCase.size() - 1){
                System.out.print(lowerCase.get(i) + ", ");
            } else {
                System.out.print(lowerCase.get(i));
            }
        }
        System.out.println();
        System.out.print("Mixed-case: ");
        for (int i = 0; i < mixedCase.size(); i++) {
            if (i < mixedCase.size()-1){
                System.out.print(mixedCase.get(i) + ", ");
            } else {
                System.out.print(mixedCase.get(i));
            }
        }
        System.out.println();
        System.out.print("Upper-case: ");
        for (int i = 0; i < upperCase.size(); i++) {
            if (i < upperCase.size()-1){
                System.out.print(upperCase.get(i) + ", ");
            } else {
                System.out.print(upperCase.get(i));
            }
        }
        System.out.println();
    }
}
