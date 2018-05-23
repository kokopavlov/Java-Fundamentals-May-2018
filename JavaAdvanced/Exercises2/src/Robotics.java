import java.util.*;
import java.util.stream.Stream;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] robots = scanner.nextLine().split(";");
        ArrayDeque<String> robotQueue = new ArrayDeque();
        for (int i = 0; i < robots.length; i++) {
            robotQueue.offer(robots[i]);
        }
        int[] startTime = Stream.of(scanner.nextLine().split(":")).mapToInt(x-> Integer.parseInt(x)).toArray();
        int startSecond = startTime[0] * 3600 + startTime[1] * 60 + startTime[2];
        ArrayDeque<String> products = new ArrayDeque<>();
        Map<String, Integer> workingRobots = new HashMap<>();
        String command = scanner.nextLine();
        while (!"End".equals(command)){
            products.offer(command);
            command = scanner.nextLine();
        }
        while (products.size() > 0){
            startSecond++;
            if (!robotQueue.isEmpty()){
                String currentRobot = robotQueue.poll();
                String currentProduct = products.poll();
                int currentSecond = (startSecond % 3600) % 60;
                int currentMinute = (startSecond / 60) % 60;
                int currentHour = startSecond / 3600;
                workingRobots.put(currentRobot, startSecond);
                String[] robotDetails = currentRobot.split("-");
                String robotName = robotDetails[0];
                System.out.printf("%s - %s [%02d:%02d:%02d]", robotName, currentProduct, currentHour, currentMinute, currentSecond);
                System.out.println();
            } else {
                products.offer(products.poll());
                for (String robot:workingRobots.keySet()
                     ) {
                    String[] robotDetails = robot.split("-");
                    int robotTime = Integer.parseInt(robotDetails[1]);
                    int robotStartTime = workingRobots.get(robot);
                    int workedTime = robotStartTime + robotTime;
                    if (workedTime <= startSecond + 1){
                        robotQueue.offer(robot);
                    }
                }
            }
        }
    }
}
