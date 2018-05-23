import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phonebook = new HashMap<>();
        String input;
        while (!"search".equals(input = scanner.nextLine())){
            String[] phonebookEntry = input.split("-");
            String name = phonebookEntry[0];
            String number = phonebookEntry[1];
            if (!phonebook.containsKey(name)){
                phonebook.put(name, "");
            }
            phonebook.put(name, number);
        }
        while (!"stop".equals(input = scanner.nextLine())){
            String searchName = input;
            if (phonebook.containsKey(searchName)){
                System.out.println(searchName + " -> " + phonebook.get(searchName));
            } else {
                System.out.println("Contact " + searchName + " does not exist.");
            }
        }
    }
}
