package service;

import model.Vehicle;
import java.util.*;
import java.util.stream.Collectors;

public class RentalService {
    private List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Vehicle findById(int id) {
        return vehicles.stream()
                .filter(v -> v.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Vehicle> filterByType(String type) {
        return vehicles.stream()
                .filter(v -> v.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    public List<Vehicle> sortByPrice() {
        return vehicles.stream()
                .sorted(Comparator.comparingDouble(Vehicle::getPricePerDay))
                .collect(Collectors.toList());
    }

    public List<Vehicle> getAllVehicles() {
        return vehicles;
    }
}
