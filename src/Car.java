public class Car extends Vehicle {

    public Car(String id, String brand, double pricePerDay) {
        super(id, brand, pricePerDay);
    }

    @Override
    public String getType() {
        return "Car";
    }
}
