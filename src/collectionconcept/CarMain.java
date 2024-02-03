package collectionconcept;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class CarMain {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList = new ArrayList<>(); // capacity 10
        Car car1 = new Car("Audi","Audis20",2000000);
        Car car2 = new Car("Tesla","tesla m3",2000000);
        carArrayList.add(car1);
        carArrayList.add(car2);
        System.out.println(carArrayList);
        Car car = carArrayList.get(0);
        String name = car.getName();
        System.out.println(car);
        System.out.println(name);

        ArrayList<Integer> initialSizeArrayList = new ArrayList<>(200); // initial capacity 200
        System.out.println(initialSizeArrayList);

        ArrayList arrayList = new ArrayList<>();


    }
}
