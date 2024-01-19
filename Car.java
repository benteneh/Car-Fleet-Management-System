public class Car {
    private String makeAndModel;
    private int numberOfDoors;
    private int maxpass;

    public Car() {
        this.makeAndModel = "none assigned";
        this.numberOfDoors = 4;
        this.maxpass = 5;
    }

    public Car(String makeAndModel, int numberOfDoors, int maximumNumberOfPassengers) {
        this.makeAndModel = makeAndModel;
        this.numberOfDoors = numberOfDoors;
        this.maxpass = maximumNumberOfPassengers; 
    }    

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel() {
        return this.makeAndModel;
    }

    public void setMaximumNumberOfPassengers(int maximumNumberOfPassengers) {
        this.maxpass = maximumNumberOfPassengers;
    }

    public int getMaximumNumberOfPassengers() {
        return this.maxpass;
    }

    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

    public int getnumberOfDoor() {
        return this.numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car: " + this.makeAndModel + ", Doors: " + this.numberOfDoors +
                ", Maximum Passengers: " + this.maxpass;
    }
}
