import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Stream;

public class CountSymbols    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> treeMap = new TreeMap<>();
        String[] symbols = scanner.nextLine().split("");
        for (int i = 0; i < symbols.length; i++) {
            if(!treeMap.containsKey(symbols[i])){
                treeMap.put(symbols[i], 0);
            }
            treeMap.put(symbols[i], treeMap.get(symbols[i]) + 1);
        }
        for (String symbol:treeMap.keySet()
             ) {
            System.out.printf("%s: %d time/s%n", symbol, treeMap.get(symbol));
        }
    }
}
