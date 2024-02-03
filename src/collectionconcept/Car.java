package collectionconcept;

import java.util.Objects;

public class Car {
    private String brand;
    private String name;
    private int basePrice;

    public Car(String brand, String name, int basePrice) {
        this.brand = brand;
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return basePrice == car.basePrice && Objects.equals(brand, car.brand) && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, name, basePrice);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
