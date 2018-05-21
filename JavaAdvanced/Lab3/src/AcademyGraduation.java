import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Stream;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Map<String, double[]> students = new TreeMap<>();
        for (int i = 0; i < number; i++) {
            String name = scanner.nextLine();
            double[] grades = Stream.of(scanner.nextLine().split("\\s+")).mapToDouble(x -> Double.parseDouble(x)).toArray();
            if (!students.containsKey(name)){
                students.put(name, grades);
            }

        }
        for (String student:students.keySet()
             ) {
            double gradeSum = 0;
            for (int i = 0; i < students.get(student).length; i++) {
                gradeSum += students.get(student)[i];
            }
            double average = gradeSum / students.get(student).length;
            System.out.printf("%s is graduated with %s%n", student, average);
        }
    }
}
