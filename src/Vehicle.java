import java.util.Objects;

public abstract class Vehicle {
    private String id;
    private String brand;
    private double pricePerDay;

    public Vehicle(String id, String brand, double pricePerDay) {
        this.id = id;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + " [id=" + id + ", brand=" + brand + ", pricePerDay=" + pricePerDay + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return id.equals(vehicle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
