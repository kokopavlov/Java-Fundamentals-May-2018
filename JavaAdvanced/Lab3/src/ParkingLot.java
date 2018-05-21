import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> cars = new HashSet<>();

        String input = scanner.nextLine();

        while(!"END".equals(input)){
            String[] carInfo = input.split(", ");
            String direction = carInfo[0];
            String carPlate = carInfo[1];

            if("IN".equals(direction)){
                cars.add(carPlate);
            } else if ("OUT".equals(direction)){
                cars.remove(carPlate);
            }
            input = scanner.nextLine();
        }
        if (!cars.isEmpty()){
            for (String car:cars
                    ) {
                System.out.println(car);
            }
        } else {
            System.out.println("Parking Lot is Empty");
        }

    }
}
