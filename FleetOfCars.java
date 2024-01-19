import java.util.ArrayList;
import java.util.List;

public class FleetOfCars {
    private List<Car> cars;

    public FleetOfCars() {
        cars = new ArrayList<>();
    }
    public FleetOfCars search(String searchString) {
        FleetOfCars result = new FleetOfCars();
            for (Car car : cars) {
            if (car.getMakeAndModel().contains(searchString)) {
                result.add(car);
            }
        }
            return result;
    }

    public void add(Car car) {
        cars.add(car);
    }

    public int getSize() {
        return cars.size();
    }

    public void delete(int index) {
        cars.remove(index);
    }

    public Car get(int index) {
        if (index >= 0 && index < cars.size()) {
            return cars.get(index);
        }
        
        return null;
    }
    @Override
        public String toString() {
            return "Fleet of Cars:\n" + cars;
        }
}
