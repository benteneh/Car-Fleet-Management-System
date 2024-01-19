public class ElectricCar extends Car {
    private double batterySize;

    public ElectricCar() {
        super("none assigned", 4, 5);
        this.batterySize = -1;
    }

    public ElectricCar(String makeAndModel, int numberOfDoors, int maximumNumberOfPassengers, double batterySize) {
        super(makeAndModel, numberOfDoors, maximumNumberOfPassengers);
        this.batterySize = batterySize;
    }

    public void setBatterySize(double batterySize) {
        this.batterySize = batterySize;
    }

    public double getBatterySize() {
        return this.batterySize;
    }
    @Override
        public String toString() {
            return "Battery Size:\n" + batterySize;
        }
}
    
