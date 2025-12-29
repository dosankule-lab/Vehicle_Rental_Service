import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RentalService {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Search by brand
    public List<Vehicle> searchByBrand(String brand) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getBrand().equalsIgnoreCase(brand)) {
                result.add(v);
            }
        }
        return result;
    }

    // Filter by max price
    public List<Vehicle> filterByPrice(double maxPrice) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getPricePerDay() <= maxPrice) {
                result.add(v);
            }
        }
        return result;
    }

    // Sort by price
    public void sortByPrice() {
        vehicles.sort(Comparator.comparingDouble(Vehicle::getPricePerDay));
    }

    public void showAllVehicles() {
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}
