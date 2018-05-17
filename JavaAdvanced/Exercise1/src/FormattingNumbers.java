import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        String aToHex = Integer.toHexString(a).toUpperCase();
        String aToBin = Integer.toBinaryString(a);
        int BinToInt = Integer.parseInt(aToBin);

        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", aToHex, BinToInt, b, c);
    }
}
