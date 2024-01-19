public class GasolineCar extends Car {
    private double gasTankSize;

    public GasolineCar() {
        super();
        this.gasTankSize = -1;
    }

    public GasolineCar(String makeAndModel, int numberOfDoors, int maximumNumberOfPassengers, double gasTankSize) {
        super(makeAndModel, numberOfDoors, maximumNumberOfPassengers);
        this.gasTankSize = gasTankSize;
    }

    public void setGasTankSize(double gasTankSize) {
        this.gasTankSize = gasTankSize;
    }

    public double getGasTankSize() {
        return this.gasTankSize;
    }
    @Override
        public String toString() {
            return "Gas tank size:\n" + gasTankSize;
        }
}
