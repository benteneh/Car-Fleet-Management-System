
public class MainProgram {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        FleetOfCars myfleet = new FleetOfCars();

        while (true) {
            System.out.println("Enter Option From List Below: ");
            System.out.println("1) Display Complete Directory");
            System.out.println("2) Enter new Car");
            System.out.println("3) Search for a Car");
            System.out.println("4) Modify Car Information");
            System.out.println("5) Delete a Record");
            System.out.println("Q) Quit");
            System.out.println("Enter your Option: ");

            String choice = myObj.nextLine();

            if (choice.equals("1")) {
                System.out.println("Complete Directory: ");
                System.out.println(myfleet);

            } else if (choice.equals("2")) {
                System.out.println("Enter new car information: ");
                Scanner input2 = new Scanner(System.in);
                System.out.println("Make and Model of Car?"); 
                String makeModel = input2.nextLine();
                System.out.println("How many Passengers?"); 
                int maxPass = input2.nextInt();
                System.out.println("Number of Doors?");
                int numberOfDoors = input2.nextInt(); 
                myfleet.add(new Car(makeModel, numberOfDoors, maxPass));
                System.out.println("Car Has Been Added");

            } else if (choice.equals("3")) {
                Scanner input3 = new Scanner(System.in);
                System.out.println("Enter Car Make and Model: ");
                String s = input3.nextLine();
                FleetOfCars result = myfleet.search(s);
                System.out.println(result);

            } else if (choice.equals("4")) {
                System.out.println("What Car Information Would You Like to Modify?");
                Scanner input4 = new Scanner(System.in);
                String makeModelToModify = input4.nextLine();
                FleetOfCars result = myfleet.search(makeModelToModify);
                if (result.getSize() > 0) {
                    System.out.println("Car found. Enter new information:");
                    System.out.println("How many Passengers?");
                    int newMaxPass = input4.nextInt();
                    System.out.println("Number of Doors?");
                    int newNumberOfDoors = input4.nextInt();
                    Car carToModify = result.get(0);
                    carToModify.setMaximumNumberOfPassengers(newMaxPass);
                    carToModify.setNumberOfDoors(newNumberOfDoors);
                    System.out.println("Car information modified.");
                } else {
                    System.out.println("Car not found.");
                }

            } else if (choice.equals("5")) {
                System.out.println("Enter the Index of the Car you would like to delete: ");
                Scanner input5 = new Scanner(System.in);
                int DeleteCar = input5.nextInt();
                if (DeleteCar >= 0 && DeleteCar < myfleet.getSize()) {
                        myfleet.delete(DeleteCar);
                        System.out.println("Car at index " + DeleteCar + " deleted successfully.");
                        System.out.println("Remaining 5" + myfleet);
                    } else {
                        System.out.println("Invalid index. Please enter a valid index.");
                    }
            } else if (choice.equals("Q")) {
                System.out.println("Quitting, Have a Great Day!");
                break;
                
            } else if (choice.equals("q")) {
                System.out.println("Quitting, Have a Great Day!");
                break;
            }
        }
    }
}
