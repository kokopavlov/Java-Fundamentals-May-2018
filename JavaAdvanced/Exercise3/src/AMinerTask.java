import java.util.*;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputList = new ArrayList<>();
        Map<String, String> linkedMap = new LinkedHashMap<>();
        String input;
        while (!"stop".equals(input = scanner.nextLine())){
            inputList.add(input);
        }
        for (int i = 0; i < inputList.size() - 1; i+=2) {
            String resource = inputList.get(i);
            String quantity = inputList.get(i + 1);
            if(!linkedMap.containsKey(resource)){
                linkedMap.put(resource, quantity);
            }
        }
        for (String resource: linkedMap.keySet()
             ) {
            System.out.println(resource + " -> " + linkedMap.get(resource));
        }
    }
}
