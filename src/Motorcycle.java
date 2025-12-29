public class Motorcycle extends Vehicle {

    public Motorcycle(String id, String brand, double pricePerDay) {
        super(id, brand, pricePerDay);
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }
}
