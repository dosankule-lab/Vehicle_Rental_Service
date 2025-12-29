package model;

public class Bike extends Vehicle {
    private boolean electric;

    public Bike(int id, String brand, double pricePerDay, boolean electric) {
        super(id, brand, pricePerDay);
        this.electric = electric;
    }

    public boolean isElectric() {
        return electric;
    }

    @Override
    public String getType() {
        return "Bike";
    }
}
