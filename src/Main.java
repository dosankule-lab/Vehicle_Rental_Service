import model.*;
import service.RentalService;

public class Main {
    public static void main(String[] args) {

        RentalService service = new RentalService();

        service.addVehicle(new Car(1, "Toyota", 50, 4));
        service.addVehicle(new Car(2, "BMW", 80, 2));
        service.addVehicle(new Bike(3, "Yamaha", 30, false));
        service.addVehicle(new Bike(4, "Xiaomi", 25, true));

        System.out.println("All vehicles:");
        service.getAllVehicles().forEach(System.out::println);

        System.out.println("\nCars only:");
        service.filterByType("Car").forEach(System.out::println);

        System.out.println("\nSorted by price:");
        service.sortByPrice().forEach(System.out::println);

        System.out.println("\nFind by ID = 3:");
        System.out.println(service.findById(3));
    }
}
