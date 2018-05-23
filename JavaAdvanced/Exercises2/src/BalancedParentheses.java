import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");
        boolean isBalanced = false;
        //{{[[(())]]}}
        if (input.length % 2 == 0){
            int halfLenght = input.length / 2;
            String[] firstHalf = new String[halfLenght];
            String[] secondHalf = new String[halfLenght];
            for (int i = 0; i < halfLenght; i++) {
                firstHalf[i] = input[i];
            }
            for (int i = 0; i < halfLenght ; i++) {
                secondHalf[i] = input[input.length - 1 - i];
            }
            for (int i = 0; i < halfLenght; i++) {
                if (("(".equals(firstHalf[i]) && ")".equals(secondHalf[i])) ||
                        "{".equals(firstHalf[i]) && "}".equals(secondHalf[i]) ||
                        "[".equals(firstHalf[i]) && "]".equals(secondHalf[i])){
                    isBalanced = true;
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (isBalanced){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
