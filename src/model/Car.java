package model;

public class Car extends Vehicle {
    private int doors;

    public Car(int id, String brand, double pricePerDay, int doors) {
        super(id, brand, pricePerDay);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String getType() {
        return "Car";
    }
}
